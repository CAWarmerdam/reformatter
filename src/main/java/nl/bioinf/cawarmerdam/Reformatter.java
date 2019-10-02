package nl.bioinf.cawarmerdam;

import umcg.genetica.math.matrix2.DoubleMatrixDataset;

import java.io.*;

public class Reformatter {

//    public static void main(String[] args) throws Exception {
//        DoubleMatrixDataset<String, String> dataset1 = DoubleMatrixDataset.loadDoubleData("D:/Documenten/UMCG/Data/Hi-C/out/gene_matrix.tsv");
//        DoubleMatrixDataset<String, String> dataset2 = DoubleMatrixDataset.loadDoubleData("D:/Documenten/UMCG/Data/Hi-C/out/gene_matrix.tsv");
//        DoubleMatrixDataset<String, String> d1SortedAccordingToD1 = dataset1.viewSelection(dataset1.getRowObjects(), dataset1.getColObjects());
//        DoubleMatrixDataset<String, String> d2SortedAccordingToD1 = dataset2.viewSelection(dataset1.getRowObjects(), dataset1.getColObjects());
//        d1SortedAccordingToD1.getMatrix().assign(d2SortedAccordingToD1.getMatrix(), new Plus());
//        d1SortedAccordingToD1.save("D:/Documenten/UMCG/Data/Hi-C/out/gene-matrix_2019-09-26.tsv");
//        d1SortedAccordingToD1.saveBinary("D:/Documenten/UMCG/Data/Hi-C/out/gene-matrix_2019-09-26.tsv");
//    }

    public static void main(String[] args) throws Exception {
        System.out.println("args = " + args[0] + args[1]);
        DoubleMatrixDataset<String, String> dataset = DoubleMatrixDataset.loadDoubleData(args[0]);
        dataset.saveBinary(args[1]);
    }

//    public static void main(String[] args) throws IOException {
//        DoubleMatrixDataset<String, String> stringStringDoubleMatrixDataset = DoubleMatrixDataset.loadDoubleBinaryData("D:/Documenten/UMCG/Projects/PPI-interactions/InBio_Map_core_2016_09_12/gene-matrix_19-9-2019_1012");
//        stringStringDoubleMatrixDataset.save("D:/Documenten/UMCG/Projects/PPI-interactions/InBio_Map_core_2016_09_12/test.tsv");
//    }

//    public static void main(String[] args) throws IOException {
//
//        // Load the symmetricShortDistanceMatrix, which is a symmetric matrix
//        ExpressionDataset datasetInWeb = new ExpressionDataset(
//                "D:/Documenten/UMCG/Projects/PPI-interactions/InBio_Map_core_2016_09_12/core.psimitab.UniqueGenes.txt");
//        nl.bioinf.cawarmerdam.SymmetricShortDistanceMatrix matrix = new nl.bioinf.cawarmerdam.SymmetricShortDistanceMatrix(datasetInWeb.nrProbes);
//        matrix.load(new java.io.File("D:/Documenten/UMCG/Projects/PPI-interactions/InBio_Map_core_2016_09_12/core.psimitab.AllPairsShortestPath.dat"));
//
//        // Get the list of gene names
//        List<String> geneNames = Arrays.asList(datasetInWeb.probeNames);
//
//        // Initialize the DoubleMatrixDataset using all gene names as both the columnnames and rownames
//        DoubleMatrixDataset dataset = new DoubleMatrixDataset<>(geneNames, geneNames);
//
//        // Nested loop to loop through the matrices.
//        for (int y = 0; y < geneNames.size(); y++) {
//            for (int x = 0; x < geneNames.size(); x++) {
//
//                // Get the integer from the symmetric matrix using the regular get method and cast this to a double
//                double intItem = matrix.get(x, y);
//
//                if (intItem > 1) {
//                    intItem = 0;
//                }
//                // Insert the double into the goal dataset. Not sure if the casting is correct
//                dataset.setElementQuick(x, y, intItem);
//            }
//        }
//
//        // Save the filled dataset
//        dataset.saveBinary("D:/Documenten/UMCG/Projects/PPI-interactions/InBio_Map_core_2016_09_12/gene-matrix_26-9-2019_1721");
//        dataset.save("D:/Documenten/UMCG/Projects/PPI-interactions/InBio_Map_core_2016_09_12/gene-matrix_26-9-2019_1721.tsv");
//    }

    public Reformatter(int size) {

    }

}