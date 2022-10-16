

# DatasetGroup

<p>A dataset group is a collection of related datasets (Interactions, User, and Item). You create a dataset group by calling <a href=\"https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetGroup.html\">CreateDatasetGroup</a>. You then create a dataset and add it to a dataset group by calling <a href=\"https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDataset.html\">CreateDataset</a>. The dataset group is used to create and train a solution by calling <a href=\"https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolution.html\">CreateSolution</a>. A dataset group can contain only one of each type of dataset.</p> <p>You can specify an Key Management Service (KMS) key to encrypt the datasets in the group.</p>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**String**](String.md) |  |  [optional] |
|**datasetGroupArn** | [**String**](String.md) |  |  [optional] |
|**status** | [**String**](String.md) |  |  [optional] |
|**roleArn** | [**String**](String.md) |  |  [optional] |
|**kmsKeyArn** | [**String**](String.md) |  |  [optional] |
|**creationDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**lastUpdatedDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**failureReason** | [**String**](String.md) |  |  [optional] |
|**domain** | [**Domain**](Domain.md) |  |  [optional] |



