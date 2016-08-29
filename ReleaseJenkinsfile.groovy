releasePipeline{
    buildCommands = [] 
    ocHost = 'master1.env2-1.innovation.labs.redhat.com'
    dockerRegistry = 'registry.apps.env2-1.innovation.labs.redhat.com'
    appName = 'web'
    envs = [
        [name: 'Dev', projectName: 'ig-dev'],
        [name: 'Stage', projectName: 'ig-stage' ],
        [name: 'Demo', projectName: 'ig-demo' ]
   ]
}
