def call(Map config = [:]) {

                withSonarQubeEnv(installationName: config.installationName) {
                    // Configure the SonarQube analysis properties
                    script {
                        def scannerHome = tool '${config.tool}'
                        sh "${scannerHome}/bin/sonar-scanner"
                    }
                }

}
