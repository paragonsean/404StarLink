

# ReplicationTaskAssessmentRun

<p>Provides information that describes a premigration assessment run that you have started using the <code>StartReplicationTaskAssessmentRun</code> operation.</p> <p>Some of the information appears based on other operations that can return the <code>ReplicationTaskAssessmentRun</code> object.</p>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**replicationTaskAssessmentRunArn** | [**String**](String.md) |  |  [optional] |
|**replicationTaskArn** | [**String**](String.md) |  |  [optional] |
|**status** | [**String**](String.md) |  |  [optional] |
|**replicationTaskAssessmentRunCreationDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**assessmentProgress** | [**ReplicationTaskAssessmentRunAssessmentProgress**](ReplicationTaskAssessmentRunAssessmentProgress.md) |  |  [optional] |
|**lastFailureMessage** | [**String**](String.md) |  |  [optional] |
|**serviceAccessRoleArn** | [**String**](String.md) |  |  [optional] |
|**resultLocationBucket** | [**String**](String.md) |  |  [optional] |
|**resultLocationFolder** | [**String**](String.md) |  |  [optional] |
|**resultEncryptionMode** | [**String**](String.md) |  |  [optional] |
|**resultKmsKeyArn** | [**String**](String.md) |  |  [optional] |
|**assessmentRunName** | [**String**](String.md) |  |  [optional] |



