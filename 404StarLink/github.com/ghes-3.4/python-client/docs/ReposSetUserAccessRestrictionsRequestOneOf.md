# ReposSetUserAccessRestrictionsRequestOneOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**users** | **List[str]** | The username for users | 

## Example

```python
from openapi_client.models.repos_set_user_access_restrictions_request_one_of import ReposSetUserAccessRestrictionsRequestOneOf

# TODO update the JSON string below
json = "{}"
# create an instance of ReposSetUserAccessRestrictionsRequestOneOf from a JSON string
repos_set_user_access_restrictions_request_one_of_instance = ReposSetUserAccessRestrictionsRequestOneOf.from_json(json)
# print the JSON string representation of the object
print(ReposSetUserAccessRestrictionsRequestOneOf.to_json())

# convert the object into a dict
repos_set_user_access_restrictions_request_one_of_dict = repos_set_user_access_restrictions_request_one_of_instance.to_dict()
# create an instance of ReposSetUserAccessRestrictionsRequestOneOf from a dict
repos_set_user_access_restrictions_request_one_of_from_dict = ReposSetUserAccessRestrictionsRequestOneOf.from_dict(repos_set_user_access_restrictions_request_one_of_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


