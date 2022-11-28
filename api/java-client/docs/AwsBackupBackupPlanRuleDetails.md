

# AwsBackupBackupPlanRuleDetails

Provides details about an array of <code>BackupRule</code> objects, each of which specifies a scheduled task that is used to back up a selection of resources. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**targetBackupVault** | [**String**](String.md) |  |  [optional] |
|**startWindowMinutes** | [**Integer**](Integer.md) |  |  [optional] |
|**scheduleExpression** | [**String**](String.md) |  |  [optional] |
|**ruleName** | [**String**](String.md) |  |  [optional] |
|**ruleId** | [**String**](String.md) |  |  [optional] |
|**enableContinuousBackup** | [**Boolean**](Boolean.md) |  |  [optional] |
|**completionWindowMinutes** | [**Integer**](Integer.md) |  |  [optional] |
|**copyActions** | [**List**](List.md) |  |  [optional] |
|**lifecycle** | [**AwsBackupBackupPlanRuleCopyActionsDetailsLifecycle**](AwsBackupBackupPlanRuleCopyActionsDetailsLifecycle.md) |  |  [optional] |



