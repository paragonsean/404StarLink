# ReposSetAppAccessRestrictionsRequestOneOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apps** | **List[str]** | The GitHub Apps that have push access to this branch. Use the slugified version of the app name. **Note**: The list of users, apps, and teams in total is limited to 100 items. | 

## Example

```python
from openapi_client.models.repos_set_app_access_restrictions_request_one_of import ReposSetAppAccessRestrictionsRequestOneOf

# TODO update the JSON string below
json = "{}"
# create an instance of ReposSetAppAccessRestrictionsRequestOneOf from a JSON string
repos_set_app_access_restrictions_request_one_of_instance = ReposSetAppAccessRestrictionsRequestOneOf.from_json(json)
# print the JSON string representation of the object
print(ReposSetAppAccessRestrictionsRequestOneOf.to_json())

# convert the object into a dict
repos_set_app_access_restrictions_request_one_of_dict = repos_set_app_access_restrictions_request_one_of_instance.to_dict()
# create an instance of ReposSetAppAccessRestrictionsRequestOneOf from a dict
repos_set_app_access_restrictions_request_one_of_from_dict = ReposSetAppAccessRestrictionsRequestOneOf.from_dict(repos_set_app_access_restrictions_request_one_of_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


