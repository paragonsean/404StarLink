# CampaignResponseCustomDeliveryConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_uri** | **str** |  | 
**endpoint_types** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.campaign_response_custom_delivery_configuration import CampaignResponseCustomDeliveryConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignResponseCustomDeliveryConfiguration from a JSON string
campaign_response_custom_delivery_configuration_instance = CampaignResponseCustomDeliveryConfiguration.from_json(json)
# print the JSON string representation of the object
print(CampaignResponseCustomDeliveryConfiguration.to_json())

# convert the object into a dict
campaign_response_custom_delivery_configuration_dict = campaign_response_custom_delivery_configuration_instance.to_dict()
# create an instance of CampaignResponseCustomDeliveryConfiguration from a dict
campaign_response_custom_delivery_configuration_from_dict = CampaignResponseCustomDeliveryConfiguration.from_dict(campaign_response_custom_delivery_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


