# Licensing

Configure Licensing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**os_byol** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.licensing import Licensing

# TODO update the JSON string below
json = "{}"
# create an instance of Licensing from a JSON string
licensing_instance = Licensing.from_json(json)
# print the JSON string representation of the object
print(Licensing.to_json())

# convert the object into a dict
licensing_dict = licensing_instance.to_dict()
# create an instance of Licensing from a dict
licensing_from_dict = Licensing.from_dict(licensing_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


