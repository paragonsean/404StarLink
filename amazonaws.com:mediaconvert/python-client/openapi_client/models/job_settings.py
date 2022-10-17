# coding: utf-8

"""
    AWS Elemental MediaConvert

    AWS Elemental MediaConvert

    The version of the OpenAPI document: 2017-08-29
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
from openapi_client.models.create_job_request_settings_avail_blanking import CreateJobRequestSettingsAvailBlanking
from openapi_client.models.create_job_request_settings_esam import CreateJobRequestSettingsEsam
from openapi_client.models.create_job_request_settings_extended_data_services import CreateJobRequestSettingsExtendedDataServices
from openapi_client.models.create_job_request_settings_kantar_watermark import CreateJobRequestSettingsKantarWatermark
from openapi_client.models.create_job_request_settings_motion_image_inserter import CreateJobRequestSettingsMotionImageInserter
from openapi_client.models.create_job_request_settings_nielsen_configuration import CreateJobRequestSettingsNielsenConfiguration
from openapi_client.models.create_job_request_settings_nielsen_non_linear_watermark import CreateJobRequestSettingsNielsenNonLinearWatermark
from openapi_client.models.create_job_request_settings_timecode_config import CreateJobRequestSettingsTimecodeConfig
from openapi_client.models.create_job_request_settings_timed_metadata_insertion import CreateJobRequestSettingsTimedMetadataInsertion
from typing import Optional, Set
from typing_extensions import Self

class JobSettings(BaseModel):
    """
    JobSettings contains all the transcode settings for a job.
    """ # noqa: E501
    ad_avail_offset: Optional[Any] = Field(default=None, alias="AdAvailOffset")
    avail_blanking: Optional[CreateJobRequestSettingsAvailBlanking] = Field(default=None, alias="AvailBlanking")
    esam: Optional[CreateJobRequestSettingsEsam] = Field(default=None, alias="Esam")
    extended_data_services: Optional[CreateJobRequestSettingsExtendedDataServices] = Field(default=None, alias="ExtendedDataServices")
    inputs: Optional[Any] = Field(default=None, alias="Inputs")
    kantar_watermark: Optional[CreateJobRequestSettingsKantarWatermark] = Field(default=None, alias="KantarWatermark")
    motion_image_inserter: Optional[CreateJobRequestSettingsMotionImageInserter] = Field(default=None, alias="MotionImageInserter")
    nielsen_configuration: Optional[CreateJobRequestSettingsNielsenConfiguration] = Field(default=None, alias="NielsenConfiguration")
    nielsen_non_linear_watermark: Optional[CreateJobRequestSettingsNielsenNonLinearWatermark] = Field(default=None, alias="NielsenNonLinearWatermark")
    output_groups: Optional[Any] = Field(default=None, alias="OutputGroups")
    timecode_config: Optional[CreateJobRequestSettingsTimecodeConfig] = Field(default=None, alias="TimecodeConfig")
    timed_metadata_insertion: Optional[CreateJobRequestSettingsTimedMetadataInsertion] = Field(default=None, alias="TimedMetadataInsertion")
    __properties: ClassVar[List[str]] = ["AdAvailOffset", "AvailBlanking", "Esam", "ExtendedDataServices", "Inputs", "KantarWatermark", "MotionImageInserter", "NielsenConfiguration", "NielsenNonLinearWatermark", "OutputGroups", "TimecodeConfig", "TimedMetadataInsertion"]

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
        """Create an instance of JobSettings from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of avail_blanking
        if self.avail_blanking:
            _dict['AvailBlanking'] = self.avail_blanking.to_dict()
        # override the default output from pydantic by calling `to_dict()` of esam
        if self.esam:
            _dict['Esam'] = self.esam.to_dict()
        # override the default output from pydantic by calling `to_dict()` of extended_data_services
        if self.extended_data_services:
            _dict['ExtendedDataServices'] = self.extended_data_services.to_dict()
        # override the default output from pydantic by calling `to_dict()` of kantar_watermark
        if self.kantar_watermark:
            _dict['KantarWatermark'] = self.kantar_watermark.to_dict()
        # override the default output from pydantic by calling `to_dict()` of motion_image_inserter
        if self.motion_image_inserter:
            _dict['MotionImageInserter'] = self.motion_image_inserter.to_dict()
        # override the default output from pydantic by calling `to_dict()` of nielsen_configuration
        if self.nielsen_configuration:
            _dict['NielsenConfiguration'] = self.nielsen_configuration.to_dict()
        # override the default output from pydantic by calling `to_dict()` of nielsen_non_linear_watermark
        if self.nielsen_non_linear_watermark:
            _dict['NielsenNonLinearWatermark'] = self.nielsen_non_linear_watermark.to_dict()
        # override the default output from pydantic by calling `to_dict()` of timecode_config
        if self.timecode_config:
            _dict['TimecodeConfig'] = self.timecode_config.to_dict()
        # override the default output from pydantic by calling `to_dict()` of timed_metadata_insertion
        if self.timed_metadata_insertion:
            _dict['TimedMetadataInsertion'] = self.timed_metadata_insertion.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of JobSettings from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "AdAvailOffset": obj.get("AdAvailOffset"),
            "AvailBlanking": CreateJobRequestSettingsAvailBlanking.from_dict(obj["AvailBlanking"]) if obj.get("AvailBlanking") is not None else None,
            "Esam": CreateJobRequestSettingsEsam.from_dict(obj["Esam"]) if obj.get("Esam") is not None else None,
            "ExtendedDataServices": CreateJobRequestSettingsExtendedDataServices.from_dict(obj["ExtendedDataServices"]) if obj.get("ExtendedDataServices") is not None else None,
            "Inputs": obj.get("Inputs"),
            "KantarWatermark": CreateJobRequestSettingsKantarWatermark.from_dict(obj["KantarWatermark"]) if obj.get("KantarWatermark") is not None else None,
            "MotionImageInserter": CreateJobRequestSettingsMotionImageInserter.from_dict(obj["MotionImageInserter"]) if obj.get("MotionImageInserter") is not None else None,
            "NielsenConfiguration": CreateJobRequestSettingsNielsenConfiguration.from_dict(obj["NielsenConfiguration"]) if obj.get("NielsenConfiguration") is not None else None,
            "NielsenNonLinearWatermark": CreateJobRequestSettingsNielsenNonLinearWatermark.from_dict(obj["NielsenNonLinearWatermark"]) if obj.get("NielsenNonLinearWatermark") is not None else None,
            "OutputGroups": obj.get("OutputGroups"),
            "TimecodeConfig": CreateJobRequestSettingsTimecodeConfig.from_dict(obj["TimecodeConfig"]) if obj.get("TimecodeConfig") is not None else None,
            "TimedMetadataInsertion": CreateJobRequestSettingsTimedMetadataInsertion.from_dict(obj["TimedMetadataInsertion"]) if obj.get("TimedMetadataInsertion") is not None else None
        })
        return _obj


