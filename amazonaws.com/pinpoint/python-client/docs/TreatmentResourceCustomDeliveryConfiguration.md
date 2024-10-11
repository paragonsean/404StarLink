# TreatmentResourceCustomDeliveryConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_uri** | **str** |  | 
**endpoint_types** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.treatment_resource_custom_delivery_configuration import TreatmentResourceCustomDeliveryConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of TreatmentResourceCustomDeliveryConfiguration from a JSON string
treatment_resource_custom_delivery_configuration_instance = TreatmentResourceCustomDeliveryConfiguration.from_json(json)
# print the JSON string representation of the object
print(TreatmentResourceCustomDeliveryConfiguration.to_json())

# convert the object into a dict
treatment_resource_custom_delivery_configuration_dict = treatment_resource_custom_delivery_configuration_instance.to_dict()
# create an instance of TreatmentResourceCustomDeliveryConfiguration from a dict
treatment_resource_custom_delivery_configuration_from_dict = TreatmentResourceCustomDeliveryConfiguration.from_dict(treatment_resource_custom_delivery_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


