# UserClientCorporate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **str** |  | [optional] 
**id** | **int** |  | [optional] 
**logo** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**phone_number** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.user_client_corporate import UserClientCorporate

# TODO update the JSON string below
json = "{}"
# create an instance of UserClientCorporate from a JSON string
user_client_corporate_instance = UserClientCorporate.from_json(json)
# print the JSON string representation of the object
print(UserClientCorporate.to_json())

# convert the object into a dict
user_client_corporate_dict = user_client_corporate_instance.to_dict()
# create an instance of UserClientCorporate from a dict
user_client_corporate_from_dict = UserClientCorporate.from_dict(user_client_corporate_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


