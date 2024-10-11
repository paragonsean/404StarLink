# WriteTreatmentResource

Specifies the settings for a campaign treatment. A <i>treatment</i> is a variation of a campaign that's used for A/B testing of a campaign.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**custom_delivery_configuration** | [**TreatmentResourceCustomDeliveryConfiguration**](TreatmentResourceCustomDeliveryConfiguration.md) |  | [optional] 
**message_configuration** | [**TreatmentResourceMessageConfiguration**](TreatmentResourceMessageConfiguration.md) |  | [optional] 
**schedule** | [**TreatmentResourceSchedule**](TreatmentResourceSchedule.md) |  | [optional] 
**size_percent** | **int** |  | 
**template_configuration** | [**TreatmentResourceTemplateConfiguration**](TreatmentResourceTemplateConfiguration.md) |  | [optional] 
**treatment_description** | **str** |  | [optional] 
**treatment_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.write_treatment_resource import WriteTreatmentResource

# TODO update the JSON string below
json = "{}"
# create an instance of WriteTreatmentResource from a JSON string
write_treatment_resource_instance = WriteTreatmentResource.from_json(json)
# print the JSON string representation of the object
print(WriteTreatmentResource.to_json())

# convert the object into a dict
write_treatment_resource_dict = write_treatment_resource_instance.to_dict()
# create an instance of WriteTreatmentResource from a dict
write_treatment_resource_from_dict = WriteTreatmentResource.from_dict(write_treatment_resource_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


