//package org.kramerlab.autoencoder.demo
//
//import org.kramerlab.autoencoder.math.optimization.DifferentiableErrorFunctionFactory
//import org.kramerlab.autoencoder.math.optimization.Minimizer
//import org.kramerlab.autoencoder.neuralnet.rbm.DefaultRbmTrainingConfiguration
//import org.kramerlab.autoencoder.math.optimization.SquareErrorFunctionFactory
//import org.kramerlab.autoencoder.math.optimization.CG_Rasmussen2
//import org.kramerlab.autoencoder.math.optimization.CrossEntropyErrorFunctionFactory
//import org.kramerlab.autoencoder.neuralnet.rbm.ConstantConfigurationTrainingStrategy
//import org.kramerlab.autoencoder.neuralnet.rbm.RbmTrainingStrategy
//
//object Arff_Corel5k extends ManuallyFittedExperimentMain {
//
//  val fileName = "Corel5k.arff"
//  val isSparse = false
//  val compressionDimension = 8
//  val numLayers = 3
//  val layerAlpha = 0.7
//  val rbmTrainingStrategies: List[RbmTrainingStrategy] = List.fill(numLayers){
//    new ConstantConfigurationTrainingStrategy(
//      new DefaultRbmTrainingConfiguration(
//        epochs = 64,
//        minibatchSize = 10,
//        learningRate = 0.02,
//        initialMomentum = 0.5,
//        finalMomentum = 0.875,
//        initialGibbsSamplingSteps = 1,
//        finalGibbsSamplingSteps = 2,
//        sampleVisibleUnitsDeterministically = true,
//        weightPenaltyFactor = 0.00001 
//      ),
//      0.33
//    )
//  }
//  val errorFunctionFactory = SquareErrorFunctionFactory
//  val maximumNumberOfFunctionEvaluations = 5000
//  
//}