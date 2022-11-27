# TreatmentResourceState


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_status** | [**CampaignStatus**](CampaignStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.treatment_resource_state import TreatmentResourceState

# TODO update the JSON string below
json = "{}"
# create an instance of TreatmentResourceState from a JSON string
treatment_resource_state_instance = TreatmentResourceState.from_json(json)
# print the JSON string representation of the object
print(TreatmentResourceState.to_json())

# convert the object into a dict
treatment_resource_state_dict = treatment_resource_state_instance.to_dict()
# create an instance of TreatmentResourceState from a dict
treatment_resource_state_from_dict = TreatmentResourceState.from_dict(treatment_resource_state_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


