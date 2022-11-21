# coding: utf-8

"""
    Transcoder API

    This API converts video files into formats suitable for consumer distribution. 

    The version of the OpenAPI document: v1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictFloat, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional, Union
from typing import Optional, Set
from typing_extensions import Self

class VideoStream(BaseModel):
    """
    Video stream resource.
    """ # noqa: E501
    allow_open_gop: Optional[StrictBool] = Field(default=None, description="Specifies whether an open Group of Pictures (GOP) structure should be allowed or not. The default is `false`.", alias="allowOpenGop")
    aq_strength: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Specify the intensity of the adaptive quantizer (AQ). Must be between 0 and 1, where 0 disables the quantizer and 1 maximizes the quantizer. A higher value equals a lower bitrate but smoother image. The default is 0.", alias="aqStrength")
    b_frame_count: Optional[StrictInt] = Field(default=None, description="The number of consecutive B-frames. Must be greater than or equal to zero. Must be less than `VideoStream.gop_frame_count` if set. The default is 0.", alias="bFrameCount")
    b_pyramid: Optional[StrictBool] = Field(default=None, description="Allow B-pyramid for reference frame selection. This may not be supported on all decoders. The default is `false`.", alias="bPyramid")
    bitrate_bps: Optional[StrictInt] = Field(default=None, description="Required. The video bitrate in bits per second. The minimum value is 1,000. The maximum value for H264/H265 is 800,000,000. The maximum value for VP9 is 480,000,000.", alias="bitrateBps")
    codec: Optional[StrictStr] = Field(default=None, description="Codec type. The following codecs are supported: * `h264` (default) * `h265` * `vp9`")
    crf_level: Optional[StrictInt] = Field(default=None, description="Target CRF level. Must be between 10 and 36, where 10 is the highest quality and 36 is the most efficient compression. The default is 21.", alias="crfLevel")
    enable_two_pass: Optional[StrictBool] = Field(default=None, description="Use two-pass encoding strategy to achieve better video quality. `VideoStream.rate_control_mode` must be `\"vbr\"`. The default is `false`.", alias="enableTwoPass")
    entropy_coder: Optional[StrictStr] = Field(default=None, description="The entropy coder to use. The default is `\"cabac\"`. Supported entropy coders: - 'cavlc' - 'cabac'", alias="entropyCoder")
    frame_rate: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Required. The target video frame rate in frames per second (FPS). Must be less than or equal to 120. Will default to the input frame rate if larger than the input frame rate. The API will generate an output FPS that is divisible by the input FPS, and smaller or equal to the target FPS. See [Calculate frame rate](https://cloud.google.com/transcoder/docs/concepts/frame-rate) for more information.", alias="frameRate")
    gop_duration: Optional[StrictStr] = Field(default=None, description="Select the GOP size based on the specified duration. The default is `\"3s\"`. Note that `gopDuration` must be less than or equal to [`segmentDuration`](#SegmentSettings), and [`segmentDuration`](#SegmentSettings) must be divisible by `gopDuration`.", alias="gopDuration")
    gop_frame_count: Optional[StrictInt] = Field(default=None, description="Select the GOP size based on the specified frame count. Must be greater than zero.", alias="gopFrameCount")
    height_pixels: Optional[StrictInt] = Field(default=None, description="The height of the video in pixels. Must be an even integer. When not specified, the height is adjusted to match the specified width and input aspect ratio. If both are omitted, the input height is used.", alias="heightPixels")
    pixel_format: Optional[StrictStr] = Field(default=None, description="Pixel format to use. The default is `\"yuv420p\"`. Supported pixel formats: - 'yuv420p' pixel format. - 'yuv422p' pixel format. - 'yuv444p' pixel format. - 'yuv420p10' 10-bit HDR pixel format. - 'yuv422p10' 10-bit HDR pixel format. - 'yuv444p10' 10-bit HDR pixel format. - 'yuv420p12' 12-bit HDR pixel format. - 'yuv422p12' 12-bit HDR pixel format. - 'yuv444p12' 12-bit HDR pixel format.", alias="pixelFormat")
    preset: Optional[StrictStr] = Field(default=None, description="Enforces the specified codec preset. The default is `veryfast`. The available options are FFmpeg-compatible. Note that certain values for this field may cause the transcoder to override other fields you set in the `VideoStream` message.")
    profile: Optional[StrictStr] = Field(default=None, description="Enforces the specified codec profile. The following profiles are supported: * `baseline` * `main` * `high` (default) The available options are FFmpeg-compatible. Note that certain values for this field may cause the transcoder to override other fields you set in the `VideoStream` message.")
    rate_control_mode: Optional[StrictStr] = Field(default=None, description="Specify the `rate_control_mode`. The default is `\"vbr\"`. Supported rate control modes: - 'vbr' - variable bitrate - 'crf' - constant rate factor", alias="rateControlMode")
    tune: Optional[StrictStr] = Field(default=None, description="Enforces the specified codec tune. The available options are FFmpeg-compatible. Note that certain values for this field may cause the transcoder to override other fields you set in the `VideoStream` message.")
    vbv_fullness_bits: Optional[StrictInt] = Field(default=None, description="Initial fullness of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than zero. The default is equal to 90% of `VideoStream.vbv_size_bits`.", alias="vbvFullnessBits")
    vbv_size_bits: Optional[StrictInt] = Field(default=None, description="Size of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than zero. The default is equal to `VideoStream.bitrate_bps`.", alias="vbvSizeBits")
    width_pixels: Optional[StrictInt] = Field(default=None, description="The width of the video in pixels. Must be an even integer. When not specified, the width is adjusted to match the specified height and input aspect ratio. If both are omitted, the input width is used.", alias="widthPixels")
    __properties: ClassVar[List[str]] = ["allowOpenGop", "aqStrength", "bFrameCount", "bPyramid", "bitrateBps", "codec", "crfLevel", "enableTwoPass", "entropyCoder", "frameRate", "gopDuration", "gopFrameCount", "heightPixels", "pixelFormat", "preset", "profile", "rateControlMode", "tune", "vbvFullnessBits", "vbvSizeBits", "widthPixels"]

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
        """Create an instance of VideoStream from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of VideoStream from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "allowOpenGop": obj.get("allowOpenGop"),
            "aqStrength": obj.get("aqStrength"),
            "bFrameCount": obj.get("bFrameCount"),
            "bPyramid": obj.get("bPyramid"),
            "bitrateBps": obj.get("bitrateBps"),
            "codec": obj.get("codec"),
            "crfLevel": obj.get("crfLevel"),
            "enableTwoPass": obj.get("enableTwoPass"),
            "entropyCoder": obj.get("entropyCoder"),
            "frameRate": obj.get("frameRate"),
            "gopDuration": obj.get("gopDuration"),
            "gopFrameCount": obj.get("gopFrameCount"),
            "heightPixels": obj.get("heightPixels"),
            "pixelFormat": obj.get("pixelFormat"),
            "preset": obj.get("preset"),
            "profile": obj.get("profile"),
            "rateControlMode": obj.get("rateControlMode"),
            "tune": obj.get("tune"),
            "vbvFullnessBits": obj.get("vbvFullnessBits"),
            "vbvSizeBits": obj.get("vbvSizeBits"),
            "widthPixels": obj.get("widthPixels")
        })
        return _obj


