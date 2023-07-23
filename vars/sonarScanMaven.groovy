def call(Map config = [:]) {

                withSonarQubeEnv(installationName: config.installationName) {
                    // Configure the SonarQube analysis properties
                    script {
                        def scannerHome = tool config.tool

                        sh "mvn clean verify sonar:sonar -Dsonar.projectKey=${config.projectName} -Dsonar.projectName='${config.projectName}'"
                    }
                }

}
