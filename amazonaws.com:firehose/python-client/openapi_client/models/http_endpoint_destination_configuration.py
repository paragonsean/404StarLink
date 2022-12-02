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
from openapi_client.models.cloud_watch_logging_options import CloudWatchLoggingOptions
from openapi_client.models.http_endpoint_destination_configuration_buffering_hints import HttpEndpointDestinationConfigurationBufferingHints
from openapi_client.models.http_endpoint_destination_configuration_endpoint_configuration import HttpEndpointDestinationConfigurationEndpointConfiguration
from openapi_client.models.http_endpoint_destination_configuration_request_configuration import HttpEndpointDestinationConfigurationRequestConfiguration
from openapi_client.models.http_endpoint_destination_configuration_retry_options import HttpEndpointDestinationConfigurationRetryOptions
from openapi_client.models.processing_configuration import ProcessingConfiguration
from openapi_client.models.s3_destination_configuration import S3DestinationConfiguration
from typing import Optional, Set
from typing_extensions import Self

class HttpEndpointDestinationConfiguration(BaseModel):
    """
    Describes the configuration of the HTTP endpoint destination.
    """ # noqa: E501
    endpoint_configuration: HttpEndpointDestinationConfigurationEndpointConfiguration = Field(alias="EndpointConfiguration")
    buffering_hints: Optional[HttpEndpointDestinationConfigurationBufferingHints] = Field(default=None, alias="BufferingHints")
    cloud_watch_logging_options: Optional[CloudWatchLoggingOptions] = Field(default=None, alias="CloudWatchLoggingOptions")
    request_configuration: Optional[HttpEndpointDestinationConfigurationRequestConfiguration] = Field(default=None, alias="RequestConfiguration")
    processing_configuration: Optional[ProcessingConfiguration] = Field(default=None, alias="ProcessingConfiguration")
    role_arn: Optional[Any] = Field(default=None, alias="RoleARN")
    retry_options: Optional[HttpEndpointDestinationConfigurationRetryOptions] = Field(default=None, alias="RetryOptions")
    s3_backup_mode: Optional[Any] = Field(default=None, alias="S3BackupMode")
    s3_configuration: S3DestinationConfiguration = Field(alias="S3Configuration")
    __properties: ClassVar[List[str]] = ["EndpointConfiguration", "BufferingHints", "CloudWatchLoggingOptions", "RequestConfiguration", "ProcessingConfiguration", "RoleARN", "RetryOptions", "S3BackupMode", "S3Configuration"]

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
        """Create an instance of HttpEndpointDestinationConfiguration from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of endpoint_configuration
        if self.endpoint_configuration:
            _dict['EndpointConfiguration'] = self.endpoint_configuration.to_dict()
        # override the default output from pydantic by calling `to_dict()` of buffering_hints
        if self.buffering_hints:
            _dict['BufferingHints'] = self.buffering_hints.to_dict()
        # override the default output from pydantic by calling `to_dict()` of cloud_watch_logging_options
        if self.cloud_watch_logging_options:
            _dict['CloudWatchLoggingOptions'] = self.cloud_watch_logging_options.to_dict()
        # override the default output from pydantic by calling `to_dict()` of request_configuration
        if self.request_configuration:
            _dict['RequestConfiguration'] = self.request_configuration.to_dict()
        # override the default output from pydantic by calling `to_dict()` of processing_configuration
        if self.processing_configuration:
            _dict['ProcessingConfiguration'] = self.processing_configuration.to_dict()
        # override the default output from pydantic by calling `to_dict()` of retry_options
        if self.retry_options:
            _dict['RetryOptions'] = self.retry_options.to_dict()
        # override the default output from pydantic by calling `to_dict()` of s3_backup_mode
        if self.s3_backup_mode:
            _dict['S3BackupMode'] = self.s3_backup_mode.to_dict()
        # override the default output from pydantic by calling `to_dict()` of s3_configuration
        if self.s3_configuration:
            _dict['S3Configuration'] = self.s3_configuration.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of HttpEndpointDestinationConfiguration from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "EndpointConfiguration": HttpEndpointDestinationConfigurationEndpointConfiguration.from_dict(obj["EndpointConfiguration"]) if obj.get("EndpointConfiguration") is not None else None,
            "BufferingHints": HttpEndpointDestinationConfigurationBufferingHints.from_dict(obj["BufferingHints"]) if obj.get("BufferingHints") is not None else None,
            "CloudWatchLoggingOptions": CloudWatchLoggingOptions.from_dict(obj["CloudWatchLoggingOptions"]) if obj.get("CloudWatchLoggingOptions") is not None else None,
            "RequestConfiguration": HttpEndpointDestinationConfigurationRequestConfiguration.from_dict(obj["RequestConfiguration"]) if obj.get("RequestConfiguration") is not None else None,
            "ProcessingConfiguration": ProcessingConfiguration.from_dict(obj["ProcessingConfiguration"]) if obj.get("ProcessingConfiguration") is not None else None,
            "RoleARN": obj.get("RoleARN"),
            "RetryOptions": HttpEndpointDestinationConfigurationRetryOptions.from_dict(obj["RetryOptions"]) if obj.get("RetryOptions") is not None else None,
            "S3BackupMode": HttpEndpointS3BackupMode.from_dict(obj["S3BackupMode"]) if obj.get("S3BackupMode") is not None else None,
            "S3Configuration": S3DestinationConfiguration.from_dict(obj["S3Configuration"]) if obj.get("S3Configuration") is not None else None
        })
        return _obj


