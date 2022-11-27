# CustomDeliveryConfiguration

Specifies the delivery configuration settings for sending a campaign or campaign treatment through a custom channel. This object is required if you use the CampaignCustomMessage object to define the message to send for the campaign or campaign treatment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_uri** | **str** |  | 
**endpoint_types** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.custom_delivery_configuration import CustomDeliveryConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of CustomDeliveryConfiguration from a JSON string
custom_delivery_configuration_instance = CustomDeliveryConfiguration.from_json(json)
# print the JSON string representation of the object
print(CustomDeliveryConfiguration.to_json())

# convert the object into a dict
custom_delivery_configuration_dict = custom_delivery_configuration_instance.to_dict()
# create an instance of CustomDeliveryConfiguration from a dict
custom_delivery_configuration_from_dict = CustomDeliveryConfiguration.from_dict(custom_delivery_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


