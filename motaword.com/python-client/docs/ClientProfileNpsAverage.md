# ClientProfileNpsAverage

information for all nps survey that this client completed

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completed_surveys_count** | **float** | total number of completed survey count by this client | [optional] 
**score** | **float** | average score for all coompleted surveys | [optional] 

## Example

```python
from openapi_client.models.client_profile_nps_average import ClientProfileNpsAverage

# TODO update the JSON string below
json = "{}"
# create an instance of ClientProfileNpsAverage from a JSON string
client_profile_nps_average_instance = ClientProfileNpsAverage.from_json(json)
# print the JSON string representation of the object
print(ClientProfileNpsAverage.to_json())

# convert the object into a dict
client_profile_nps_average_dict = client_profile_nps_average_instance.to_dict()
# create an instance of ClientProfileNpsAverage from a dict
client_profile_nps_average_from_dict = ClientProfileNpsAverage.from_dict(client_profile_nps_average_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


