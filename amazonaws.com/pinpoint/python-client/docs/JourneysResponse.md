# JourneysResponse

Provides information about the status, configuration, and other settings for all the journeys that are associated with an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | **List** |  | 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.journeys_response import JourneysResponse

# TODO update the JSON string below
json = "{}"
# create an instance of JourneysResponse from a JSON string
journeys_response_instance = JourneysResponse.from_json(json)
# print the JSON string representation of the object
print(JourneysResponse.to_json())

# convert the object into a dict
journeys_response_dict = journeys_response_instance.to_dict()
# create an instance of JourneysResponse from a dict
journeys_response_from_dict = JourneysResponse.from_dict(journeys_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


