# CreateUserRequestName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**formatted** | **str** |  | [optional] 
**family_name** | **str** |  | [optional] 
**given_name** | **str** |  | [optional] 
**middle_name** | **str** |  | [optional] 
**honorific_prefix** | **str** |  | [optional] 
**honorific_suffix** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.create_user_request_name import CreateUserRequestName

# TODO update the JSON string below
json = "{}"
# create an instance of CreateUserRequestName from a JSON string
create_user_request_name_instance = CreateUserRequestName.from_json(json)
# print the JSON string representation of the object
print(CreateUserRequestName.to_json())

# convert the object into a dict
create_user_request_name_dict = create_user_request_name_instance.to_dict()
# create an instance of CreateUserRequestName from a dict
create_user_request_name_from_dict = CreateUserRequestName.from_dict(create_user_request_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


