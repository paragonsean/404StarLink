# Name


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**first_name** | **str** | The individual&#39;s first name. | 
**infix** | **str** | The infix in the individual&#39;s name, if any. | [optional] 
**last_name** | **str** | The individual&#39;s last name. | 

## Example

```python
from openapi_client.models.name import Name

# TODO update the JSON string below
json = "{}"
# create an instance of Name from a JSON string
name_instance = Name.from_json(json)
# print the JSON string representation of the object
print(Name.to_json())

# convert the object into a dict
name_dict = name_instance.to_dict()
# create an instance of Name from a dict
name_from_dict = Name.from_dict(name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


