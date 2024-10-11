# UserClient


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**corporate** | [**UserClientCorporate**](UserClientCorporate.md) |  | [optional] 
**nps** | **float** |  | [optional] 
**subjects** | **Dict[str, int]** |  | [optional] 

## Example

```python
from openapi_client.models.user_client import UserClient

# TODO update the JSON string below
json = "{}"
# create an instance of UserClient from a JSON string
user_client_instance = UserClient.from_json(json)
# print the JSON string representation of the object
print(UserClient.to_json())

# convert the object into a dict
user_client_dict = user_client_instance.to_dict()
# create an instance of UserClient from a dict
user_client_from_dict = UserClient.from_dict(user_client_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


