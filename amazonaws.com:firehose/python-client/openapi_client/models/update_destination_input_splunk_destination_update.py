# coding: utf-8

"""
    Amazon Kinesis Firehose

    <fullname>Amazon Kinesis Data Firehose API Reference</fullname> <p>Amazon Kinesis Data Firehose is a fully managed service that delivers real-time streaming data to destinations such as Amazon Simple Storage Service (Amazon S3), Amazon OpenSearch Service, Amazon Redshift, Splunk, and various other supportd destinations.</p>

    The version of the OpenAPI document: 2015-08-04
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.extended_s3_destination_configuration_processing_configuration import ExtendedS3DestinationConfigurationProcessingConfiguration
from openapi_client.models.hec_endpoint_type import HECEndpointType
from openapi_client.models.int import int
from openapi_client.models.s3_destination_description_cloud_watch_logging_options import S3DestinationDescriptionCloudWatchLoggingOptions
from openapi_client.models.splunk_destination_description_retry_options import SplunkDestinationDescriptionRetryOptions
from openapi_client.models.splunk_destination_update_s3_update import SplunkDestinationUpdateS3Update
from openapi_client.models.splunk_s3_backup_mode import SplunkS3BackupMode
from openapi_client.models.str import str
from typing import Optional, Set
from typing_extensions import Self

class UpdateDestinationInputSplunkDestinationUpdate(BaseModel):
    """
    UpdateDestinationInputSplunkDestinationUpdate
    """ # noqa: E501
    hec_endpoint: Optional[Any] = Field(default=None, alias="HECEndpoint")
    hec_endpoint_type: Optional[Any] = Field(default=None, alias="HECEndpointType")
    hec_token: Optional[Any] = Field(default=None, alias="HECToken")
    hec_acknowledgment_timeout_in_seconds: Optional[Any] = Field(default=None, alias="HECAcknowledgmentTimeoutInSeconds")
    retry_options: Optional[SplunkDestinationDescriptionRetryOptions] = Field(default=None, alias="RetryOptions")
    s3_backup_mode: Optional[Any] = Field(default=None, alias="S3BackupMode")
    s3_update: Optional[SplunkDestinationUpdateS3Update] = Field(default=None, alias="S3Update")
    processing_configuration: Optional[ExtendedS3DestinationConfigurationProcessingConfiguration] = Field(default=None, alias="ProcessingConfiguration")
    cloud_watch_logging_options: Optional[S3DestinationDescriptionCloudWatchLoggingOptions] = Field(default=None, alias="CloudWatchLoggingOptions")
    __properties: ClassVar[List[str]] = ["HECEndpoint", "HECEndpointType", "HECToken", "HECAcknowledgmentTimeoutInSeconds", "RetryOptions", "S3BackupMode", "S3Update", "ProcessingConfiguration", "CloudWatchLoggingOptions"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of UpdateDestinationInputSplunkDestinationUpdate from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of hec_endpoint_type
        if self.hec_endpoint_type:
            _dict['HECEndpointType'] = self.hec_endpoint_type.to_dict()
        # override the default output from pydantic by calling `to_dict()` of retry_options
        if self.retry_options:
            _dict['RetryOptions'] = self.retry_options.to_dict()
        # override the default output from pydantic by calling `to_dict()` of s3_backup_mode
        if self.s3_backup_mode:
            _dict['S3BackupMode'] = self.s3_backup_mode.to_dict()
        # override the default output from pydantic by calling `to_dict()` of s3_update
        if self.s3_update:
            _dict['S3Update'] = self.s3_update.to_dict()
        # override the default output from pydantic by calling `to_dict()` of processing_configuration
        if self.processing_configuration:
            _dict['ProcessingConfiguration'] = self.processing_configuration.to_dict()
        # override the default output from pydantic by calling `to_dict()` of cloud_watch_logging_options
        if self.cloud_watch_logging_options:
            _dict['CloudWatchLoggingOptions'] = self.cloud_watch_logging_options.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of UpdateDestinationInputSplunkDestinationUpdate from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "HECEndpoint": obj.get("HECEndpoint"),
            "HECEndpointType": HECEndpointType.from_dict(obj["HECEndpointType"]) if obj.get("HECEndpointType") is not None else None,
            "HECToken": obj.get("HECToken"),
            "HECAcknowledgmentTimeoutInSeconds": obj.get("HECAcknowledgmentTimeoutInSeconds"),
            "RetryOptions": SplunkDestinationDescriptionRetryOptions.from_dict(obj["RetryOptions"]) if obj.get("RetryOptions") is not None else None,
            "S3BackupMode": SplunkS3BackupMode.from_dict(obj["S3BackupMode"]) if obj.get("S3BackupMode") is not None else None,
            "S3Update": SplunkDestinationUpdateS3Update.from_dict(obj["S3Update"]) if obj.get("S3Update") is not None else None,
            "ProcessingConfiguration": ExtendedS3DestinationConfigurationProcessingConfiguration.from_dict(obj["ProcessingConfiguration"]) if obj.get("ProcessingConfiguration") is not None else None,
            "CloudWatchLoggingOptions": S3DestinationDescriptionCloudWatchLoggingOptions.from_dict(obj["CloudWatchLoggingOptions"]) if obj.get("CloudWatchLoggingOptions") is not None else None
        })
        return _obj


