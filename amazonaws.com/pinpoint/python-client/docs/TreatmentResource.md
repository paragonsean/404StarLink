# TreatmentResource

Specifies the settings for a campaign treatment. A <i>treatment</i> is a variation of a campaign that's used for A/B testing of a campaign.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**custom_delivery_configuration** | [**TreatmentResourceCustomDeliveryConfiguration**](TreatmentResourceCustomDeliveryConfiguration.md) |  | [optional] 
**id** | **str** |  | 
**message_configuration** | [**TreatmentResourceMessageConfiguration**](TreatmentResourceMessageConfiguration.md) |  | [optional] 
**schedule** | [**TreatmentResourceSchedule**](TreatmentResourceSchedule.md) |  | [optional] 
**size_percent** | **int** |  | 
**state** | [**TreatmentResourceState**](TreatmentResourceState.md) |  | [optional] 
**template_configuration** | [**TreatmentResourceTemplateConfiguration**](TreatmentResourceTemplateConfiguration.md) |  | [optional] 
**treatment_description** | **str** |  | [optional] 
**treatment_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.treatment_resource import TreatmentResource

# TODO update the JSON string below
json = "{}"
# create an instance of TreatmentResource from a JSON string
treatment_resource_instance = TreatmentResource.from_json(json)
# print the JSON string representation of the object
print(TreatmentResource.to_json())

# convert the object into a dict
treatment_resource_dict = treatment_resource_instance.to_dict()
# create an instance of TreatmentResource from a dict
treatment_resource_from_dict = TreatmentResource.from_dict(treatment_resource_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


