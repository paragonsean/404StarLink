# PubsubConfig

PubsubConfig describes the configuration of a trigger that creates a build whenever a Pub/Sub message is published.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**service_account_email** | **str** | Service account that will make the push request. | [optional] 
**state** | **str** | Potential issues with the underlying Pub/Sub subscription configuration. Only populated on get requests. | [optional] 
**subscription** | **str** | Output only. Name of the subscription. Format is &#x60;projects/{project}/subscriptions/{subscription}&#x60;. | [optional] [readonly] 
**topic** | **str** | The name of the topic from which this subscription is receiving messages. Format is &#x60;projects/{project}/topics/{topic}&#x60;. | [optional] 

## Example

```python
from openapi_client.models.pubsub_config import PubsubConfig

# TODO update the JSON string below
json = "{}"
# create an instance of PubsubConfig from a JSON string
pubsub_config_instance = PubsubConfig.from_json(json)
# print the JSON string representation of the object
print(PubsubConfig.to_json())

# convert the object into a dict
pubsub_config_dict = pubsub_config_instance.to_dict()
# create an instance of PubsubConfig from a dict
pubsub_config_from_dict = PubsubConfig.from_dict(pubsub_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


