Jenkins Pipeline
A pipeline is a collection of steps/stages executed in the Continuous Integration and Continuous Deployment (CI/CD) process.
 A pipeline step consists of checkout, build, test, and deployment of your code.

A Jenkinsfile is a text file where we define our pipeline as a code. The Jenkinsfile exists within our project repository.
There are 2 types of JenkinsFile:
1. Declarative pipeline
2. Scripted Pipeline

Parts of declarative pipeline:
1. pipeline – keyword, with which every Jenkinsfile must start with.
2. agent – this means using which Jenkins environment will the entire pipeline or a particular stage will run, examples of agents can be maven, docker, etc. The agent any means, run the pipeline on any available agent.
3. stages – consists of one more stage.
4. stage – a task of our workflow.
5. steps – It is where we define what to do as part of the task.

https://devopscube.com/jenkins-multibranch-pipeline-tutorial/


Jenkins Multi Branch Pipeline: A multi-branch pipeline is a concept of automatically creating Jenkins pipelines based on Git branches. It can automatically discover new branches in the source control (Github) and automatically create a pipeline for that branch. When the pipeline build starts, Jenkins uses the Jenkinsfile in that branch for build stages. 

Multi-branch pipeline supports PR based branch discovery. Meaning, branches get discovered automatically in the pipeline if someone raises a PR (pull request) from a branch. If you have this configuration enabled, builds will get triggered only if a PR is raised. 

<b>Here is how the multi-branch pipeline works.<b>

When a developer creates a PR from a feature branch to develop a branch, Github sends a webhook with the  PR information to Jenkins.
Jenkins receives the PR and finds the relevant multibranch pipeline, and creates a feature branch pipeline automatically. It then runs the jobs with the steps mentioned in the Jenkinsfile from the feature branch. During checkout, the source and target branches in the PR gets merged. The PR merge will be blocked on Github until a build status from Jenkins is returned.
Once the build finishes, Jenkins will update the status to Github PR. Now you will be able to merge the code. If you want to check the Jenkins build logs, you can find the Jenkins build log link in the PR status.

Configure Webhook For Multibranch Pipeline

Add your Jenkins URL followed by “token name” under payload URL. Select the content type as “application/json” and click “Add Webhook”

