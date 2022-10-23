# WorkerConfig

Defines the configuration to be used for creating workers in the pool.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disk_size_gb** | **str** | Size of the disk attached to the worker, in GB. See [Worker pool config file](https://cloud.google.com/build/docs/private-pools/worker-pool-config-file-schema). Specify a value of up to 2000. If &#x60;0&#x60; is specified, Cloud Build will use a standard disk size. | [optional] 
**machine_type** | **str** | Machine type of a worker, such as &#x60;e2-medium&#x60;. See [Worker pool config file](https://cloud.google.com/build/docs/private-pools/worker-pool-config-file-schema). If left blank, Cloud Build will use a sensible default. | [optional] 

## Example

```python
from openapi_client.models.worker_config import WorkerConfig

# TODO update the JSON string below
json = "{}"
# create an instance of WorkerConfig from a JSON string
worker_config_instance = WorkerConfig.from_json(json)
# print the JSON string representation of the object
print(WorkerConfig.to_json())

# convert the object into a dict
worker_config_dict = worker_config_instance.to_dict()
# create an instance of WorkerConfig from a dict
worker_config_from_dict = WorkerConfig.from_dict(worker_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


