# StaticKeyProvider

Use these settings to set up encryption with a static key provider.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key_format** | **str** |  | [optional] 
**key_format_versions** | **str** |  | [optional] 
**static_key_value** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.static_key_provider import StaticKeyProvider

# TODO update the JSON string below
json = "{}"
# create an instance of StaticKeyProvider from a JSON string
static_key_provider_instance = StaticKeyProvider.from_json(json)
# print the JSON string representation of the object
print(StaticKeyProvider.to_json())

# convert the object into a dict
static_key_provider_dict = static_key_provider_instance.to_dict()
# create an instance of StaticKeyProvider from a dict
static_key_provider_from_dict = StaticKeyProvider.from_dict(static_key_provider_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


