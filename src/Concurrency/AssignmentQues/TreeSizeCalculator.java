package Concurrency.AssignmentQues;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    private Node rootNode;
    private ExecutorService es;

    public TreeSizeCalculator(Node rootNode, ExecutorService es){
        this.rootNode = rootNode;
        this.es = es;
    }

    @Override
    public Integer call() throws Exception {

        if(rootNode == null){
            return 0;
        }
        TreeSizeCalculator leftSizeCal = new TreeSizeCalculator(rootNode.left, es);
        TreeSizeCalculator rightSizeCal = new TreeSizeCalculator(rootNode.right, es);

        Future<Integer> leftSize = es.submit(leftSizeCal);
        Future<Integer> rightSize = es.submit(rightSizeCal);

        return leftSize.get() + rightSize.get() + 1;
    }
}
