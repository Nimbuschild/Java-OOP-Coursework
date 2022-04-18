// Sekou Hera

package com.example.exercise25_11;

import com.example.exercise25_11.BST;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import java.util.Collection;

public class BSTAnimation extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        BST<Integer> tree = new BST<>(); // Create a tree

        BorderPane pane = new BorderPane();
        BTView view = new BTView(tree); // Create a BTView
        pane.setCenter(view);

        TextField tfKey = new TextField();
        tfKey.setPrefColumnCount(3);
        tfKey.setAlignment(Pos.BASELINE_RIGHT);
        Button btInsert = new Button("Insert");
        Button btDelete = new Button("Delete");
        HBox hBox = new HBox(5);
        hBox.getChildren().addAll(new Label("Enter a key: "), tfKey, btInsert, btDelete);
        hBox.setAlignment(Pos.CENTER);
        pane.setBottom(hBox);

        btInsert.setOnAction(e -> {
            int key = Integer.parseInt(tfKey.getText());
            if (tree.search(key)) { // key is in the tree already
                view.displayTree();
                view.setStatus(key + " is already in the tree");
            } else {
                tree.insert(key); // Insert a new key
                view.displayTree();
                view.setStatus(key + " is inserted in the tree");
            }
        });

        btDelete.setOnAction(e -> {
            int key = Integer.parseInt(tfKey.getText());
            if (!tree.search(key)) { // key is not in the tree
                view.displayTree();
                view.setStatus(key + " is not in the tree");
            } else {
                tree.delete(key); // Delete a key
                view.displayTree();
                view.setStatus(key + " is deleted from the tree");
            }
        });

        // Create a scene and place the pane in the stage
        Scene scene = new Scene(pane, 450, 250);
        primaryStage.setTitle("BSTAnimation"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    public static class BTView extends Pane {

        private BST<Integer> tree = new BST<>();
        private double radius = 15; // Tree node radius
        private double vGap = 50; // Gap between two levels in a tree

        BTView(BST<Integer> tree) {
            this.tree = tree;
            setStatus("Tree is empty");
        }

        public void setStatus(String msg) {
            getChildren().add(new Text(20, 20, msg));
        }

        public void displayTree() {
            this.getChildren().clear(); // Clear the pane
            if (tree.getRoot() != null) {
                // Display tree recursively
                displayTree(tree.getRoot(), getWidth() / 2, vGap, getWidth() / 4);
            }
        }

        /**
         * Display a subtree rooted at position (x, y)
         */
        private void displayTree(BST.TreeNode<Integer> root,
                                 double x, double y, double hGap) {
            if (root.left != null) {
                // Draw a line to the left node
                getChildren().add(new Line(x - hGap, y + vGap, x, y));
                // Draw the left subtree recursively
                displayTree(root.left, x - hGap, y + vGap, hGap / 2);
            }

            if (root.right != null) {
                // Draw a line to the right node
                getChildren().add(new Line(x + hGap, y + vGap, x, y));
                // Draw the right subtree recursively
                displayTree(root.right, x + hGap, y + vGap, hGap / 2);
            }

            // Display a node
            Circle circle = new Circle(x, y, radius);
            circle.setFill(Color.WHITE);
            circle.setStroke(Color.BLACK);
            getChildren().addAll(circle,
                    new Text(x - 4, y + 4, root.element + ""));
        }
    }

    public static interface Tree<E> extends Collection<E> {

        /**
         * Return true if the element is in the tree
         */
        public boolean search(E e);

        /**
         * Insert element e into the binary tree Return true if the element is
         * inserted successfully
         */
        public boolean insert(E e);

        /**
         * Delete the specified element from the tree Return true if the element is
         * deleted successfully
         */
        public boolean delete(E e);

        /**
         * Get the number of nodes in the tree
         */
        public int getSize();

        /**
         * Inorder traversal from the root
         */
        public default void inorder() {
        }

        /**
         * Postorder traversal from the root
         */
        public default void postorder() {
        }

        /**
         * Preorder traversal from the root
         */
        public default void preorder() {
        }

        @Override
        /**
         * Return true if the tree is empty
         */
        public default boolean isEmpty() {
            return this.size() == 0;
        }

        ;

        @Override
        public default boolean contains(Object e) {
            return search((E) e);
        }

        @Override
        public default boolean add(E e) {
            return insert(e);
        }

        @Override
        public default boolean remove(Object e) {
            return delete((E) e);
        }

        @Override
        public default int size() {
            return getSize();
        }

        @Override
        public default boolean containsAll(Collection<?> c) {
            // Left as an exercise
            return false;
        }

        @Override
        public default boolean addAll(Collection<? extends E> c) {
            // Left as an exercise
            return false;
        }

        @Override
        public default boolean removeAll(Collection<?> c) {
            // Left as an exercise
            return false;
        }

        @Override
        public default boolean retainAll(Collection<?> c) {
            // Left as an exercise
            return false;
        }

        @Override
        public default Object[] toArray() {
            // Left as an exercise
            return null;
        }

        @Override
        public default <T> T[] toArray(T[] array) {
            // Left as an exercise
            return null;
        }
    }
}
