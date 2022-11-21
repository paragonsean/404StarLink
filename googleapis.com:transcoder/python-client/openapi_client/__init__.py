# coding: utf-8

# flake8: noqa

"""
    Transcoder API

    This API converts video files into formats suitable for consumer distribution. 

    The version of the OpenAPI document: v1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


__version__ = "1.0.0"

# import apis into sdk package
from openapi_client.api.projects_api import ProjectsApi

# import ApiClient
from openapi_client.api_response import ApiResponse
from openapi_client.api_client import ApiClient
from openapi_client.configuration import Configuration
from openapi_client.exceptions import OpenApiException
from openapi_client.exceptions import ApiTypeError
from openapi_client.exceptions import ApiValueError
from openapi_client.exceptions import ApiKeyError
from openapi_client.exceptions import ApiAttributeError
from openapi_client.exceptions import ApiException

# import models into sdk package
from openapi_client.models.ad_break import AdBreak
from openapi_client.models.aes128_encryption import Aes128Encryption
from openapi_client.models.animation import Animation
from openapi_client.models.animation_end import AnimationEnd
from openapi_client.models.animation_fade import AnimationFade
from openapi_client.models.animation_static import AnimationStatic
from openapi_client.models.audio import Audio
from openapi_client.models.audio_atom import AudioAtom
from openapi_client.models.audio_channel import AudioChannel
from openapi_client.models.audio_channel_input import AudioChannelInput
from openapi_client.models.audio_stream import AudioStream
from openapi_client.models.color import Color
from openapi_client.models.crop import Crop
from openapi_client.models.deblock import Deblock
from openapi_client.models.denoise import Denoise
from openapi_client.models.edit_atom import EditAtom
from openapi_client.models.elementary_stream import ElementaryStream
from openapi_client.models.encryption import Encryption
from openapi_client.models.failure_detail import FailureDetail
from openapi_client.models.image import Image
from openapi_client.models.input import Input
from openapi_client.models.job import Job
from openapi_client.models.job_config import JobConfig
from openapi_client.models.job_template import JobTemplate
from openapi_client.models.list_job_templates_response import ListJobTemplatesResponse
from openapi_client.models.list_jobs_response import ListJobsResponse
from openapi_client.models.manifest import Manifest
from openapi_client.models.mpeg_common_encryption import MpegCommonEncryption
from openapi_client.models.mux_stream import MuxStream
from openapi_client.models.normalized_coordinate import NormalizedCoordinate
from openapi_client.models.origin_uri import OriginUri
from openapi_client.models.output import Output
from openapi_client.models.overlay import Overlay
from openapi_client.models.pad import Pad
from openapi_client.models.preprocessing_config import PreprocessingConfig
from openapi_client.models.progress import Progress
from openapi_client.models.pubsub_destination import PubsubDestination
from openapi_client.models.sample_aes_encryption import SampleAesEncryption
from openapi_client.models.segment_settings import SegmentSettings
from openapi_client.models.sprite_sheet import SpriteSheet
from openapi_client.models.text_atom import TextAtom
from openapi_client.models.text_input import TextInput
from openapi_client.models.text_stream import TextStream
from openapi_client.models.video_stream import VideoStream
