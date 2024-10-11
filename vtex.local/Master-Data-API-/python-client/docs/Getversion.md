# Getversion


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | **str** |  | 
**document** | [**Document**](Document.md) |  | 
**id** | **str** |  | 

## Example

```python
from openapi_client.models.getversion import Getversion

# TODO update the JSON string below
json = "{}"
# create an instance of Getversion from a JSON string
getversion_instance = Getversion.from_json(json)
# print the JSON string representation of the object
print(Getversion.to_json())

# convert the object into a dict
getversion_dict = getversion_instance.to_dict()
# create an instance of Getversion from a dict
getversion_from_dict = Getversion.from_dict(getversion_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


