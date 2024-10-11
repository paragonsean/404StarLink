# ClientProfileNps

net promoter score info for this client

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**average** | [**ClientProfileNpsAverage**](ClientProfileNpsAverage.md) |  | [optional] 
**last** | [**ClientProfileNpsLast**](ClientProfileNpsLast.md) |  | [optional] 

## Example

```python
from openapi_client.models.client_profile_nps import ClientProfileNps

# TODO update the JSON string below
json = "{}"
# create an instance of ClientProfileNps from a JSON string
client_profile_nps_instance = ClientProfileNps.from_json(json)
# print the JSON string representation of the object
print(ClientProfileNps.to_json())

# convert the object into a dict
client_profile_nps_dict = client_profile_nps_instance.to_dict()
# create an instance of ClientProfileNps from a dict
client_profile_nps_from_dict = ClientProfileNps.from_dict(client_profile_nps_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


