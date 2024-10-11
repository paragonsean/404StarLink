# DescribeDeviceResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**device_description** | [**DescribeDeviceResponseDeviceDescription**](DescribeDeviceResponseDeviceDescription.md) |  | [optional] 

## Example

```python
from openapi_client.models.describe_device_response import DescribeDeviceResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeDeviceResponse from a JSON string
describe_device_response_instance = DescribeDeviceResponse.from_json(json)
# print the JSON string representation of the object
print(DescribeDeviceResponse.to_json())

# convert the object into a dict
describe_device_response_dict = describe_device_response_instance.to_dict()
# create an instance of DescribeDeviceResponse from a dict
describe_device_response_from_dict = DescribeDeviceResponse.from_dict(describe_device_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


