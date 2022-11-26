# UsageRecordResult

A <code>UsageRecordResult</code> indicates the status of a given <code>UsageRecord</code> processed by <code>BatchMeterUsage</code>.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**usage_record** | [**UsageRecordResultUsageRecord**](UsageRecordResultUsageRecord.md) |  | [optional] 
**metering_record_id** | **str** |  | [optional] 
**status** | [**UsageRecordResultStatus**](UsageRecordResultStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.usage_record_result import UsageRecordResult

# TODO update the JSON string below
json = "{}"
# create an instance of UsageRecordResult from a JSON string
usage_record_result_instance = UsageRecordResult.from_json(json)
# print the JSON string representation of the object
print(UsageRecordResult.to_json())

# convert the object into a dict
usage_record_result_dict = usage_record_result_instance.to_dict()
# create an instance of UsageRecordResult from a dict
usage_record_result_from_dict = UsageRecordResult.from_dict(usage_record_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


