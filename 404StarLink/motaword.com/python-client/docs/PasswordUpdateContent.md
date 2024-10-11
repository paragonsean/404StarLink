# PasswordUpdateContent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**password** | **str** | New Password | [optional] 

## Example

```python
from openapi_client.models.password_update_content import PasswordUpdateContent

# TODO update the JSON string below
json = "{}"
# create an instance of PasswordUpdateContent from a JSON string
password_update_content_instance = PasswordUpdateContent.from_json(json)
# print the JSON string representation of the object
print(PasswordUpdateContent.to_json())

# convert the object into a dict
password_update_content_dict = password_update_content_instance.to_dict()
# create an instance of PasswordUpdateContent from a dict
password_update_content_from_dict = PasswordUpdateContent.from_dict(password_update_content_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


