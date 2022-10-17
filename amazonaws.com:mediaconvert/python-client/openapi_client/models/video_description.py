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
from openapi_client.models.video_description_codec_settings import VideoDescriptionCodecSettings
from openapi_client.models.video_description_crop import VideoDescriptionCrop
from openapi_client.models.video_description_position import VideoDescriptionPosition
from openapi_client.models.video_description_video_preprocessors import VideoDescriptionVideoPreprocessors
from typing import Optional, Set
from typing_extensions import Self

class VideoDescription(BaseModel):
    """
    Settings related to video encoding of your output. The specific video settings depend on the video codec that you choose. When you work directly in your JSON job specification, include one instance of Video description (VideoDescription) per output.
    """ # noqa: E501
    afd_signaling: Optional[Any] = Field(default=None, alias="AfdSignaling")
    anti_alias: Optional[Any] = Field(default=None, alias="AntiAlias")
    codec_settings: Optional[VideoDescriptionCodecSettings] = Field(default=None, alias="CodecSettings")
    color_metadata: Optional[Any] = Field(default=None, alias="ColorMetadata")
    crop: Optional[VideoDescriptionCrop] = Field(default=None, alias="Crop")
    drop_frame_timecode: Optional[Any] = Field(default=None, alias="DropFrameTimecode")
    fixed_afd: Optional[Any] = Field(default=None, alias="FixedAfd")
    height: Optional[Any] = Field(default=None, alias="Height")
    position: Optional[VideoDescriptionPosition] = Field(default=None, alias="Position")
    respond_to_afd: Optional[Any] = Field(default=None, alias="RespondToAfd")
    scaling_behavior: Optional[Any] = Field(default=None, alias="ScalingBehavior")
    sharpness: Optional[Any] = Field(default=None, alias="Sharpness")
    timecode_insertion: Optional[Any] = Field(default=None, alias="TimecodeInsertion")
    video_preprocessors: Optional[VideoDescriptionVideoPreprocessors] = Field(default=None, alias="VideoPreprocessors")
    width: Optional[Any] = Field(default=None, alias="Width")
    __properties: ClassVar[List[str]] = ["AfdSignaling", "AntiAlias", "CodecSettings", "ColorMetadata", "Crop", "DropFrameTimecode", "FixedAfd", "Height", "Position", "RespondToAfd", "ScalingBehavior", "Sharpness", "TimecodeInsertion", "VideoPreprocessors", "Width"]

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
        """Create an instance of VideoDescription from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of afd_signaling
        if self.afd_signaling:
            _dict['AfdSignaling'] = self.afd_signaling.to_dict()
        # override the default output from pydantic by calling `to_dict()` of anti_alias
        if self.anti_alias:
            _dict['AntiAlias'] = self.anti_alias.to_dict()
        # override the default output from pydantic by calling `to_dict()` of codec_settings
        if self.codec_settings:
            _dict['CodecSettings'] = self.codec_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of color_metadata
        if self.color_metadata:
            _dict['ColorMetadata'] = self.color_metadata.to_dict()
        # override the default output from pydantic by calling `to_dict()` of crop
        if self.crop:
            _dict['Crop'] = self.crop.to_dict()
        # override the default output from pydantic by calling `to_dict()` of drop_frame_timecode
        if self.drop_frame_timecode:
            _dict['DropFrameTimecode'] = self.drop_frame_timecode.to_dict()
        # override the default output from pydantic by calling `to_dict()` of position
        if self.position:
            _dict['Position'] = self.position.to_dict()
        # override the default output from pydantic by calling `to_dict()` of respond_to_afd
        if self.respond_to_afd:
            _dict['RespondToAfd'] = self.respond_to_afd.to_dict()
        # override the default output from pydantic by calling `to_dict()` of scaling_behavior
        if self.scaling_behavior:
            _dict['ScalingBehavior'] = self.scaling_behavior.to_dict()
        # override the default output from pydantic by calling `to_dict()` of timecode_insertion
        if self.timecode_insertion:
            _dict['TimecodeInsertion'] = self.timecode_insertion.to_dict()
        # override the default output from pydantic by calling `to_dict()` of video_preprocessors
        if self.video_preprocessors:
            _dict['VideoPreprocessors'] = self.video_preprocessors.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of VideoDescription from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "AfdSignaling": AfdSignaling.from_dict(obj["AfdSignaling"]) if obj.get("AfdSignaling") is not None else None,
            "AntiAlias": AntiAlias.from_dict(obj["AntiAlias"]) if obj.get("AntiAlias") is not None else None,
            "CodecSettings": VideoDescriptionCodecSettings.from_dict(obj["CodecSettings"]) if obj.get("CodecSettings") is not None else None,
            "ColorMetadata": ColorMetadata.from_dict(obj["ColorMetadata"]) if obj.get("ColorMetadata") is not None else None,
            "Crop": VideoDescriptionCrop.from_dict(obj["Crop"]) if obj.get("Crop") is not None else None,
            "DropFrameTimecode": DropFrameTimecode.from_dict(obj["DropFrameTimecode"]) if obj.get("DropFrameTimecode") is not None else None,
            "FixedAfd": obj.get("FixedAfd"),
            "Height": obj.get("Height"),
            "Position": VideoDescriptionPosition.from_dict(obj["Position"]) if obj.get("Position") is not None else None,
            "RespondToAfd": RespondToAfd.from_dict(obj["RespondToAfd"]) if obj.get("RespondToAfd") is not None else None,
            "ScalingBehavior": ScalingBehavior.from_dict(obj["ScalingBehavior"]) if obj.get("ScalingBehavior") is not None else None,
            "Sharpness": obj.get("Sharpness"),
            "TimecodeInsertion": VideoTimecodeInsertion.from_dict(obj["TimecodeInsertion"]) if obj.get("TimecodeInsertion") is not None else None,
            "VideoPreprocessors": VideoDescriptionVideoPreprocessors.from_dict(obj["VideoPreprocessors"]) if obj.get("VideoPreprocessors") is not None else None,
            "Width": obj.get("Width")
        })
        return _obj


