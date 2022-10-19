# InvokeDeviceMethodRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**device_method** | [**InvokeDeviceMethodRequestDeviceMethod**](InvokeDeviceMethodRequestDeviceMethod.md) |  | [optional] 
**device_method_parameters** | **str** | A JSON encoded string containing the device method request parameters. | [optional] 

## Example

```python
from openapi_client.models.invoke_device_method_request import InvokeDeviceMethodRequest

# TODO update the JSON string below
json = "{}"
# create an instance of InvokeDeviceMethodRequest from a JSON string
invoke_device_method_request_instance = InvokeDeviceMethodRequest.from_json(json)
# print the JSON string representation of the object
print(InvokeDeviceMethodRequest.to_json())

# convert the object into a dict
invoke_device_method_request_dict = invoke_device_method_request_instance.to_dict()
# create an instance of InvokeDeviceMethodRequest from a dict
invoke_device_method_request_from_dict = InvokeDeviceMethodRequest.from_dict(invoke_device_method_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


