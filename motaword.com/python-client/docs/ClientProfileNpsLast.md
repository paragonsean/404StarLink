# ClientProfileNpsLast

last survey info

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completion_date** | **datetime** | last surveys completion date | [optional] 
**score** | **float** | score that the client gave us | [optional] 

## Example

```python
from openapi_client.models.client_profile_nps_last import ClientProfileNpsLast

# TODO update the JSON string below
json = "{}"
# create an instance of ClientProfileNpsLast from a JSON string
client_profile_nps_last_instance = ClientProfileNpsLast.from_json(json)
# print the JSON string representation of the object
print(ClientProfileNpsLast.to_json())

# convert the object into a dict
client_profile_nps_last_dict = client_profile_nps_last_instance.to_dict()
# create an instance of ClientProfileNpsLast from a dict
client_profile_nps_last_from_dict = ClientProfileNpsLast.from_dict(client_profile_nps_last_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


