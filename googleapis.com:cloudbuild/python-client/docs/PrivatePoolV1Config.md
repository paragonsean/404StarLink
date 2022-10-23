# PrivatePoolV1Config

Configuration for a V1 `PrivatePool`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**network_config** | [**NetworkConfig**](NetworkConfig.md) |  | [optional] 
**worker_config** | [**WorkerConfig**](WorkerConfig.md) |  | [optional] 

## Example

```python
from openapi_client.models.private_pool_v1_config import PrivatePoolV1Config

# TODO update the JSON string below
json = "{}"
# create an instance of PrivatePoolV1Config from a JSON string
private_pool_v1_config_instance = PrivatePoolV1Config.from_json(json)
# print the JSON string representation of the object
print(PrivatePoolV1Config.to_json())

# convert the object into a dict
private_pool_v1_config_dict = private_pool_v1_config_instance.to_dict()
# create an instance of PrivatePoolV1Config from a dict
private_pool_v1_config_from_dict = PrivatePoolV1Config.from_dict(private_pool_v1_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


