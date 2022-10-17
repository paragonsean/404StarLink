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
from openapi_client.models.av1_adaptive_quantization import Av1AdaptiveQuantization
from openapi_client.models.av1_bit_depth import Av1BitDepth
from openapi_client.models.av1_framerate_control import Av1FramerateControl
from openapi_client.models.av1_framerate_conversion_algorithm import Av1FramerateConversionAlgorithm
from openapi_client.models.av1_rate_control_mode import Av1RateControlMode
from openapi_client.models.av1_settings_qvbr_settings import Av1SettingsQvbrSettings
from openapi_client.models.av1_spatial_adaptive_quantization import Av1SpatialAdaptiveQuantization
from openapi_client.models.float import float
from openapi_client.models.int import int
from typing import Optional, Set
from typing_extensions import Self

class VideoCodecSettingsAv1Settings(BaseModel):
    """
    VideoCodecSettingsAv1Settings
    """ # noqa: E501
    adaptive_quantization: Optional[Any] = Field(default=None, alias="AdaptiveQuantization")
    bit_depth: Optional[Any] = Field(default=None, alias="BitDepth")
    framerate_control: Optional[Any] = Field(default=None, alias="FramerateControl")
    framerate_conversion_algorithm: Optional[Any] = Field(default=None, alias="FramerateConversionAlgorithm")
    framerate_denominator: Optional[Any] = Field(default=None, alias="FramerateDenominator")
    framerate_numerator: Optional[Any] = Field(default=None, alias="FramerateNumerator")
    gop_size: Optional[Any] = Field(default=None, alias="GopSize")
    max_bitrate: Optional[Any] = Field(default=None, alias="MaxBitrate")
    number_b_frames_between_reference_frames: Optional[Any] = Field(default=None, alias="NumberBFramesBetweenReferenceFrames")
    qvbr_settings: Optional[Av1SettingsQvbrSettings] = Field(default=None, alias="QvbrSettings")
    rate_control_mode: Optional[Any] = Field(default=None, alias="RateControlMode")
    slices: Optional[Any] = Field(default=None, alias="Slices")
    spatial_adaptive_quantization: Optional[Any] = Field(default=None, alias="SpatialAdaptiveQuantization")
    __properties: ClassVar[List[str]] = ["AdaptiveQuantization", "BitDepth", "FramerateControl", "FramerateConversionAlgorithm", "FramerateDenominator", "FramerateNumerator", "GopSize", "MaxBitrate", "NumberBFramesBetweenReferenceFrames", "QvbrSettings", "RateControlMode", "Slices", "SpatialAdaptiveQuantization"]

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
        """Create an instance of VideoCodecSettingsAv1Settings from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of adaptive_quantization
        if self.adaptive_quantization:
            _dict['AdaptiveQuantization'] = self.adaptive_quantization.to_dict()
        # override the default output from pydantic by calling `to_dict()` of bit_depth
        if self.bit_depth:
            _dict['BitDepth'] = self.bit_depth.to_dict()
        # override the default output from pydantic by calling `to_dict()` of framerate_control
        if self.framerate_control:
            _dict['FramerateControl'] = self.framerate_control.to_dict()
        # override the default output from pydantic by calling `to_dict()` of framerate_conversion_algorithm
        if self.framerate_conversion_algorithm:
            _dict['FramerateConversionAlgorithm'] = self.framerate_conversion_algorithm.to_dict()
        # override the default output from pydantic by calling `to_dict()` of qvbr_settings
        if self.qvbr_settings:
            _dict['QvbrSettings'] = self.qvbr_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of rate_control_mode
        if self.rate_control_mode:
            _dict['RateControlMode'] = self.rate_control_mode.to_dict()
        # override the default output from pydantic by calling `to_dict()` of spatial_adaptive_quantization
        if self.spatial_adaptive_quantization:
            _dict['SpatialAdaptiveQuantization'] = self.spatial_adaptive_quantization.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of VideoCodecSettingsAv1Settings from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "AdaptiveQuantization": Av1AdaptiveQuantization.from_dict(obj["AdaptiveQuantization"]) if obj.get("AdaptiveQuantization") is not None else None,
            "BitDepth": Av1BitDepth.from_dict(obj["BitDepth"]) if obj.get("BitDepth") is not None else None,
            "FramerateControl": Av1FramerateControl.from_dict(obj["FramerateControl"]) if obj.get("FramerateControl") is not None else None,
            "FramerateConversionAlgorithm": Av1FramerateConversionAlgorithm.from_dict(obj["FramerateConversionAlgorithm"]) if obj.get("FramerateConversionAlgorithm") is not None else None,
            "FramerateDenominator": obj.get("FramerateDenominator"),
            "FramerateNumerator": obj.get("FramerateNumerator"),
            "GopSize": obj.get("GopSize"),
            "MaxBitrate": obj.get("MaxBitrate"),
            "NumberBFramesBetweenReferenceFrames": obj.get("NumberBFramesBetweenReferenceFrames"),
            "QvbrSettings": Av1SettingsQvbrSettings.from_dict(obj["QvbrSettings"]) if obj.get("QvbrSettings") is not None else None,
            "RateControlMode": Av1RateControlMode.from_dict(obj["RateControlMode"]) if obj.get("RateControlMode") is not None else None,
            "Slices": obj.get("Slices"),
            "SpatialAdaptiveQuantization": Av1SpatialAdaptiveQuantization.from_dict(obj["SpatialAdaptiveQuantization"]) if obj.get("SpatialAdaptiveQuantization") is not None else None
        })
        return _obj


