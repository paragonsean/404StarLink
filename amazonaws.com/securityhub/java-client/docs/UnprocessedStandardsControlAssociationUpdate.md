

# UnprocessedStandardsControlAssociationUpdate

Provides details about which control's enablement status could not be updated in a specified standard when calling the <a href=\"https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html\">BatchUpdateStandardsControlAssociations</a> API. This parameter also provides details about why the request was unprocessed. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**standardsControlAssociationUpdate** | [**UnprocessedStandardsControlAssociationUpdateStandardsControlAssociationUpdate**](UnprocessedStandardsControlAssociationUpdateStandardsControlAssociationUpdate.md) |  |  |
|**errorCode** | [**UnprocessedErrorCode**](UnprocessedErrorCode.md) |  |  |
|**errorReason** | [**String**](String.md) |  |  [optional] |



