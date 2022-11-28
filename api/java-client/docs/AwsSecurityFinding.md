

# AwsSecurityFinding

<p>Provides a consistent format for Security Hub findings. <code>AwsSecurityFinding</code> format allows you to share findings between Amazon Web Services security services and third-party solutions.</p> <note> <p>A finding is a potential security issue generated either by Amazon Web Services services or by the integrated third-party solutions and standards checks.</p> </note>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemaVersion** | [**String**](String.md) |  |  |
|**id** | [**String**](String.md) |  |  |
|**productArn** | [**String**](String.md) |  |  |
|**productName** | [**String**](String.md) |  |  [optional] |
|**companyName** | [**String**](String.md) |  |  [optional] |
|**region** | [**String**](String.md) |  |  [optional] |
|**generatorId** | [**String**](String.md) |  |  |
|**awsAccountId** | [**String**](String.md) |  |  |
|**types** | [**List**](List.md) |  |  [optional] |
|**firstObservedAt** | [**String**](String.md) |  |  [optional] |
|**lastObservedAt** | [**String**](String.md) |  |  [optional] |
|**createdAt** | [**String**](String.md) |  |  |
|**updatedAt** | [**String**](String.md) |  |  |
|**severity** | [**AwsSecurityFindingSeverity**](AwsSecurityFindingSeverity.md) |  |  [optional] |
|**confidence** | [**Integer**](Integer.md) |  |  [optional] |
|**criticality** | [**Integer**](Integer.md) |  |  [optional] |
|**title** | [**String**](String.md) |  |  |
|**description** | [**String**](String.md) |  |  |
|**remediation** | [**AwsSecurityFindingRemediation**](AwsSecurityFindingRemediation.md) |  |  [optional] |
|**sourceUrl** | [**String**](String.md) |  |  [optional] |
|**productFields** | [**Map**](Map.md) |  |  [optional] |
|**userDefinedFields** | [**Map**](Map.md) |  |  [optional] |
|**malware** | [**List**](List.md) |  |  [optional] |
|**network** | [**AwsSecurityFindingNetwork**](AwsSecurityFindingNetwork.md) |  |  [optional] |
|**networkPath** | [**List**](List.md) |  |  [optional] |
|**process** | [**AwsSecurityFindingProcess**](AwsSecurityFindingProcess.md) |  |  [optional] |
|**threats** | [**List**](List.md) |  |  [optional] |
|**threatIntelIndicators** | [**List**](List.md) |  |  [optional] |
|**resources** | [**List**](List.md) |  |  |
|**compliance** | [**AwsSecurityFindingCompliance**](AwsSecurityFindingCompliance.md) |  |  [optional] |
|**verificationState** | [**VerificationState**](VerificationState.md) |  |  [optional] |
|**workflowState** | [**WorkflowState**](WorkflowState.md) |  |  [optional] |
|**workflow** | [**AwsSecurityFindingWorkflow**](AwsSecurityFindingWorkflow.md) |  |  [optional] |
|**recordState** | [**RecordState**](RecordState.md) |  |  [optional] |
|**relatedFindings** | [**List**](List.md) |  |  [optional] |
|**note** | [**AwsSecurityFindingNote**](AwsSecurityFindingNote.md) |  |  [optional] |
|**vulnerabilities** | [**List**](List.md) |  |  [optional] |
|**patchSummary** | [**AwsSecurityFindingPatchSummary**](AwsSecurityFindingPatchSummary.md) |  |  [optional] |
|**action** | [**AwsSecurityFindingAction**](AwsSecurityFindingAction.md) |  |  [optional] |
|**findingProviderFields** | [**AwsSecurityFindingFindingProviderFields**](AwsSecurityFindingFindingProviderFields.md) |  |  [optional] |
|**sample** | [**Boolean**](Boolean.md) |  |  [optional] |



