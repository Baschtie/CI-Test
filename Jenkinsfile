pipeline {
  agent {
    docker {
      args '-v /root/.m2:/root/.m2'
      image 'maven:3-jdk-11'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn -B -DskipTests clean package'
        sh '''git config --global user.name "jenkinsci"
git config --global user.email "jenkinsci-users@googlegroups.com"'''
      }
    }

    stage('Test') {
      steps {
        sh 'javac -version'
        sh 'mvn test'
      }
    }

    stage('Archive') {
      steps {
        archiveArtifacts 'target/*.jar'
      }
    }

  }
}