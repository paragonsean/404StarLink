# MeterUsageResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metering_record_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.meter_usage_result import MeterUsageResult

# TODO update the JSON string below
json = "{}"
# create an instance of MeterUsageResult from a JSON string
meter_usage_result_instance = MeterUsageResult.from_json(json)
# print the JSON string representation of the object
print(MeterUsageResult.to_json())

# convert the object into a dict
meter_usage_result_dict = meter_usage_result_instance.to_dict()
# create an instance of MeterUsageResult from a dict
meter_usage_result_from_dict = MeterUsageResult.from_dict(meter_usage_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


