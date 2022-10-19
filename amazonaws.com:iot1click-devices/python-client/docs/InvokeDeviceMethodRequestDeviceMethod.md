# InvokeDeviceMethodRequestDeviceMethod


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**device_type** | **str** |  | [optional] 
**method_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.invoke_device_method_request_device_method import InvokeDeviceMethodRequestDeviceMethod

# TODO update the JSON string below
json = "{}"
# create an instance of InvokeDeviceMethodRequestDeviceMethod from a JSON string
invoke_device_method_request_device_method_instance = InvokeDeviceMethodRequestDeviceMethod.from_json(json)
# print the JSON string representation of the object
print(InvokeDeviceMethodRequestDeviceMethod.to_json())

# convert the object into a dict
invoke_device_method_request_device_method_dict = invoke_device_method_request_device_method_instance.to_dict()
# create an instance of InvokeDeviceMethodRequestDeviceMethod from a dict
invoke_device_method_request_device_method_from_dict = InvokeDeviceMethodRequestDeviceMethod.from_dict(invoke_device_method_request_device_method_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


