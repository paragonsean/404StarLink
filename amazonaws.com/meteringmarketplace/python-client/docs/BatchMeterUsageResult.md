# BatchMeterUsageResult

Contains the <code>UsageRecords</code> processed by <code>BatchMeterUsage</code> and any records that have failed due to transient error.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | **List** |  | [optional] 
**unprocessed_records** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.batch_meter_usage_result import BatchMeterUsageResult

# TODO update the JSON string below
json = "{}"
# create an instance of BatchMeterUsageResult from a JSON string
batch_meter_usage_result_instance = BatchMeterUsageResult.from_json(json)
# print the JSON string representation of the object
print(BatchMeterUsageResult.to_json())

# convert the object into a dict
batch_meter_usage_result_dict = batch_meter_usage_result_instance.to_dict()
# create an instance of BatchMeterUsageResult from a dict
batch_meter_usage_result_from_dict = BatchMeterUsageResult.from_dict(batch_meter_usage_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


