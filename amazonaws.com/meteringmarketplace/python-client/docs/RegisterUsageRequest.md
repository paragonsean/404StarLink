# RegisterUsageRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**product_code** | **str** |  | 
**public_key_version** | **int** |  | 
**nonce** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.register_usage_request import RegisterUsageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RegisterUsageRequest from a JSON string
register_usage_request_instance = RegisterUsageRequest.from_json(json)
# print the JSON string representation of the object
print(RegisterUsageRequest.to_json())

# convert the object into a dict
register_usage_request_dict = register_usage_request_instance.to_dict()
# create an instance of RegisterUsageRequest from a dict
register_usage_request_from_dict = RegisterUsageRequest.from_dict(register_usage_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


