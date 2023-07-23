def call(Map config = [:]) {
     sh 'sudo /usr/bin/clamscan -irf .'
}
