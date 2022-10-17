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
from openapi_client.models.float import float
from openapi_client.models.int import int
from openapi_client.models.mpeg2_adaptive_quantization import Mpeg2AdaptiveQuantization
from openapi_client.models.mpeg2_codec_level import Mpeg2CodecLevel
from openapi_client.models.mpeg2_codec_profile import Mpeg2CodecProfile
from openapi_client.models.mpeg2_dynamic_sub_gop import Mpeg2DynamicSubGop
from openapi_client.models.mpeg2_framerate_control import Mpeg2FramerateControl
from openapi_client.models.mpeg2_framerate_conversion_algorithm import Mpeg2FramerateConversionAlgorithm
from openapi_client.models.mpeg2_gop_size_units import Mpeg2GopSizeUnits
from openapi_client.models.mpeg2_interlace_mode import Mpeg2InterlaceMode
from openapi_client.models.mpeg2_intra_dc_precision import Mpeg2IntraDcPrecision
from openapi_client.models.mpeg2_par_control import Mpeg2ParControl
from openapi_client.models.mpeg2_quality_tuning_level import Mpeg2QualityTuningLevel
from openapi_client.models.mpeg2_rate_control_mode import Mpeg2RateControlMode
from openapi_client.models.mpeg2_scan_type_conversion_mode import Mpeg2ScanTypeConversionMode
from openapi_client.models.mpeg2_scene_change_detect import Mpeg2SceneChangeDetect
from openapi_client.models.mpeg2_slow_pal import Mpeg2SlowPal
from openapi_client.models.mpeg2_spatial_adaptive_quantization import Mpeg2SpatialAdaptiveQuantization
from openapi_client.models.mpeg2_syntax import Mpeg2Syntax
from openapi_client.models.mpeg2_telecine import Mpeg2Telecine
from openapi_client.models.mpeg2_temporal_adaptive_quantization import Mpeg2TemporalAdaptiveQuantization
from typing import Optional, Set
from typing_extensions import Self

class VideoCodecSettingsMpeg2Settings(BaseModel):
    """
    VideoCodecSettingsMpeg2Settings
    """ # noqa: E501
    adaptive_quantization: Optional[Any] = Field(default=None, alias="AdaptiveQuantization")
    bitrate: Optional[Any] = Field(default=None, alias="Bitrate")
    codec_level: Optional[Any] = Field(default=None, alias="CodecLevel")
    codec_profile: Optional[Any] = Field(default=None, alias="CodecProfile")
    dynamic_sub_gop: Optional[Any] = Field(default=None, alias="DynamicSubGop")
    framerate_control: Optional[Any] = Field(default=None, alias="FramerateControl")
    framerate_conversion_algorithm: Optional[Any] = Field(default=None, alias="FramerateConversionAlgorithm")
    framerate_denominator: Optional[Any] = Field(default=None, alias="FramerateDenominator")
    framerate_numerator: Optional[Any] = Field(default=None, alias="FramerateNumerator")
    gop_closed_cadence: Optional[Any] = Field(default=None, alias="GopClosedCadence")
    gop_size: Optional[Any] = Field(default=None, alias="GopSize")
    gop_size_units: Optional[Any] = Field(default=None, alias="GopSizeUnits")
    hrd_buffer_final_fill_percentage: Optional[Any] = Field(default=None, alias="HrdBufferFinalFillPercentage")
    hrd_buffer_initial_fill_percentage: Optional[Any] = Field(default=None, alias="HrdBufferInitialFillPercentage")
    hrd_buffer_size: Optional[Any] = Field(default=None, alias="HrdBufferSize")
    interlace_mode: Optional[Any] = Field(default=None, alias="InterlaceMode")
    intra_dc_precision: Optional[Any] = Field(default=None, alias="IntraDcPrecision")
    max_bitrate: Optional[Any] = Field(default=None, alias="MaxBitrate")
    min_i_interval: Optional[Any] = Field(default=None, alias="MinIInterval")
    number_b_frames_between_reference_frames: Optional[Any] = Field(default=None, alias="NumberBFramesBetweenReferenceFrames")
    par_control: Optional[Any] = Field(default=None, alias="ParControl")
    par_denominator: Optional[Any] = Field(default=None, alias="ParDenominator")
    par_numerator: Optional[Any] = Field(default=None, alias="ParNumerator")
    quality_tuning_level: Optional[Any] = Field(default=None, alias="QualityTuningLevel")
    rate_control_mode: Optional[Any] = Field(default=None, alias="RateControlMode")
    scan_type_conversion_mode: Optional[Any] = Field(default=None, alias="ScanTypeConversionMode")
    scene_change_detect: Optional[Any] = Field(default=None, alias="SceneChangeDetect")
    slow_pal: Optional[Any] = Field(default=None, alias="SlowPal")
    softness: Optional[Any] = Field(default=None, alias="Softness")
    spatial_adaptive_quantization: Optional[Any] = Field(default=None, alias="SpatialAdaptiveQuantization")
    syntax: Optional[Any] = Field(default=None, alias="Syntax")
    telecine: Optional[Any] = Field(default=None, alias="Telecine")
    temporal_adaptive_quantization: Optional[Any] = Field(default=None, alias="TemporalAdaptiveQuantization")
    __properties: ClassVar[List[str]] = ["AdaptiveQuantization", "Bitrate", "CodecLevel", "CodecProfile", "DynamicSubGop", "FramerateControl", "FramerateConversionAlgorithm", "FramerateDenominator", "FramerateNumerator", "GopClosedCadence", "GopSize", "GopSizeUnits", "HrdBufferFinalFillPercentage", "HrdBufferInitialFillPercentage", "HrdBufferSize", "InterlaceMode", "IntraDcPrecision", "MaxBitrate", "MinIInterval", "NumberBFramesBetweenReferenceFrames", "ParControl", "ParDenominator", "ParNumerator", "QualityTuningLevel", "RateControlMode", "ScanTypeConversionMode", "SceneChangeDetect", "SlowPal", "Softness", "SpatialAdaptiveQuantization", "Syntax", "Telecine", "TemporalAdaptiveQuantization"]

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
        """Create an instance of VideoCodecSettingsMpeg2Settings from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of codec_level
        if self.codec_level:
            _dict['CodecLevel'] = self.codec_level.to_dict()
        # override the default output from pydantic by calling `to_dict()` of codec_profile
        if self.codec_profile:
            _dict['CodecProfile'] = self.codec_profile.to_dict()
        # override the default output from pydantic by calling `to_dict()` of dynamic_sub_gop
        if self.dynamic_sub_gop:
            _dict['DynamicSubGop'] = self.dynamic_sub_gop.to_dict()
        # override the default output from pydantic by calling `to_dict()` of framerate_control
        if self.framerate_control:
            _dict['FramerateControl'] = self.framerate_control.to_dict()
        # override the default output from pydantic by calling `to_dict()` of framerate_conversion_algorithm
        if self.framerate_conversion_algorithm:
            _dict['FramerateConversionAlgorithm'] = self.framerate_conversion_algorithm.to_dict()
        # override the default output from pydantic by calling `to_dict()` of gop_size_units
        if self.gop_size_units:
            _dict['GopSizeUnits'] = self.gop_size_units.to_dict()
        # override the default output from pydantic by calling `to_dict()` of interlace_mode
        if self.interlace_mode:
            _dict['InterlaceMode'] = self.interlace_mode.to_dict()
        # override the default output from pydantic by calling `to_dict()` of intra_dc_precision
        if self.intra_dc_precision:
            _dict['IntraDcPrecision'] = self.intra_dc_precision.to_dict()
        # override the default output from pydantic by calling `to_dict()` of par_control
        if self.par_control:
            _dict['ParControl'] = self.par_control.to_dict()
        # override the default output from pydantic by calling `to_dict()` of quality_tuning_level
        if self.quality_tuning_level:
            _dict['QualityTuningLevel'] = self.quality_tuning_level.to_dict()
        # override the default output from pydantic by calling `to_dict()` of rate_control_mode
        if self.rate_control_mode:
            _dict['RateControlMode'] = self.rate_control_mode.to_dict()
        # override the default output from pydantic by calling `to_dict()` of scan_type_conversion_mode
        if self.scan_type_conversion_mode:
            _dict['ScanTypeConversionMode'] = self.scan_type_conversion_mode.to_dict()
        # override the default output from pydantic by calling `to_dict()` of scene_change_detect
        if self.scene_change_detect:
            _dict['SceneChangeDetect'] = self.scene_change_detect.to_dict()
        # override the default output from pydantic by calling `to_dict()` of slow_pal
        if self.slow_pal:
            _dict['SlowPal'] = self.slow_pal.to_dict()
        # override the default output from pydantic by calling `to_dict()` of spatial_adaptive_quantization
        if self.spatial_adaptive_quantization:
            _dict['SpatialAdaptiveQuantization'] = self.spatial_adaptive_quantization.to_dict()
        # override the default output from pydantic by calling `to_dict()` of syntax
        if self.syntax:
            _dict['Syntax'] = self.syntax.to_dict()
        # override the default output from pydantic by calling `to_dict()` of telecine
        if self.telecine:
            _dict['Telecine'] = self.telecine.to_dict()
        # override the default output from pydantic by calling `to_dict()` of temporal_adaptive_quantization
        if self.temporal_adaptive_quantization:
            _dict['TemporalAdaptiveQuantization'] = self.temporal_adaptive_quantization.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of VideoCodecSettingsMpeg2Settings from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "AdaptiveQuantization": Mpeg2AdaptiveQuantization.from_dict(obj["AdaptiveQuantization"]) if obj.get("AdaptiveQuantization") is not None else None,
            "Bitrate": obj.get("Bitrate"),
            "CodecLevel": Mpeg2CodecLevel.from_dict(obj["CodecLevel"]) if obj.get("CodecLevel") is not None else None,
            "CodecProfile": Mpeg2CodecProfile.from_dict(obj["CodecProfile"]) if obj.get("CodecProfile") is not None else None,
            "DynamicSubGop": Mpeg2DynamicSubGop.from_dict(obj["DynamicSubGop"]) if obj.get("DynamicSubGop") is not None else None,
            "FramerateControl": Mpeg2FramerateControl.from_dict(obj["FramerateControl"]) if obj.get("FramerateControl") is not None else None,
            "FramerateConversionAlgorithm": Mpeg2FramerateConversionAlgorithm.from_dict(obj["FramerateConversionAlgorithm"]) if obj.get("FramerateConversionAlgorithm") is not None else None,
            "FramerateDenominator": obj.get("FramerateDenominator"),
            "FramerateNumerator": obj.get("FramerateNumerator"),
            "GopClosedCadence": obj.get("GopClosedCadence"),
            "GopSize": obj.get("GopSize"),
            "GopSizeUnits": Mpeg2GopSizeUnits.from_dict(obj["GopSizeUnits"]) if obj.get("GopSizeUnits") is not None else None,
            "HrdBufferFinalFillPercentage": obj.get("HrdBufferFinalFillPercentage"),
            "HrdBufferInitialFillPercentage": obj.get("HrdBufferInitialFillPercentage"),
            "HrdBufferSize": obj.get("HrdBufferSize"),
            "InterlaceMode": Mpeg2InterlaceMode.from_dict(obj["InterlaceMode"]) if obj.get("InterlaceMode") is not None else None,
            "IntraDcPrecision": Mpeg2IntraDcPrecision.from_dict(obj["IntraDcPrecision"]) if obj.get("IntraDcPrecision") is not None else None,
            "MaxBitrate": obj.get("MaxBitrate"),
            "MinIInterval": obj.get("MinIInterval"),
            "NumberBFramesBetweenReferenceFrames": obj.get("NumberBFramesBetweenReferenceFrames"),
            "ParControl": Mpeg2ParControl.from_dict(obj["ParControl"]) if obj.get("ParControl") is not None else None,
            "ParDenominator": obj.get("ParDenominator"),
            "ParNumerator": obj.get("ParNumerator"),
            "QualityTuningLevel": Mpeg2QualityTuningLevel.from_dict(obj["QualityTuningLevel"]) if obj.get("QualityTuningLevel") is not None else None,
            "RateControlMode": Mpeg2RateControlMode.from_dict(obj["RateControlMode"]) if obj.get("RateControlMode") is not None else None,
            "ScanTypeConversionMode": Mpeg2ScanTypeConversionMode.from_dict(obj["ScanTypeConversionMode"]) if obj.get("ScanTypeConversionMode") is not None else None,
            "SceneChangeDetect": Mpeg2SceneChangeDetect.from_dict(obj["SceneChangeDetect"]) if obj.get("SceneChangeDetect") is not None else None,
            "SlowPal": Mpeg2SlowPal.from_dict(obj["SlowPal"]) if obj.get("SlowPal") is not None else None,
            "Softness": obj.get("Softness"),
            "SpatialAdaptiveQuantization": Mpeg2SpatialAdaptiveQuantization.from_dict(obj["SpatialAdaptiveQuantization"]) if obj.get("SpatialAdaptiveQuantization") is not None else None,
            "Syntax": Mpeg2Syntax.from_dict(obj["Syntax"]) if obj.get("Syntax") is not None else None,
            "Telecine": Mpeg2Telecine.from_dict(obj["Telecine"]) if obj.get("Telecine") is not None else None,
            "TemporalAdaptiveQuantization": Mpeg2TemporalAdaptiveQuantization.from_dict(obj["TemporalAdaptiveQuantization"]) if obj.get("TemporalAdaptiveQuantization") is not None else None
        })
        return _obj


