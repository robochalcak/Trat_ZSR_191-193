SIMISA@@@@@@@@@@JINX0s1t______

shape (
	shape_header ( 00000000 00000000 )
	volumes ( 2
		vol_sphere (
			vector ( 0 0 0 ) 37.1231
		)
		vol_sphere (
			vector ( 0 0 0 ) 35.3553
		)
	)
	shader_names ( 1
		named_shader ( BlendATexDiff )
	)
	texture_filter_names ( 1
		named_filter_mode ( LinearMipLinear )
	)
	points ( 4
		point ( -25 0 25 )
		point ( -25 0 -25 )
		point ( 25 0 25 )
		point ( 25 0 -25 )
	)
	uv_points ( 4
		uv_point ( 0.000499785 0.000499547 )
		uv_point ( 0.000499547 0.9995 )
		uv_point ( 0.9995 0.000499785 )
		uv_point ( 0.9995 0.9995 )
	)
	normals ( 2
		vector ( 0 1 0 )
		vector ( 0 0.707107 0 )
	)
	sort_vectors ( 1
		vector ( 0 0 0 )
	)
	colours ( 0 )
	matrices ( 1
		matrix PLANE01 ( 1 0 0 0 1 0 0 0 1 0 0 0 )
	)
	images ( 1
		image ( 270-50x50.ace )
	)
	textures ( 1
		texture ( 0 0 0 ff000000 )
	)
	light_materials ( 0 )
	light_model_cfgs ( 1
		light_model_cfg ( 00000000
			uv_ops ( 1
				uv_op_copy ( 1 0 )
			)
		)
	)
	vtx_states ( 1
		vtx_state ( 00000000 0 -5 0 00000002 )
	)
	prim_states ( 1
		prim_state Mtl_#1 ( 00000000 0
			tex_idxs ( 1 0 ) 0 0 0 0 1
		)
	)
	lod_controls ( 1
		lod_control (
			distance_levels_header ( 0 )
			distance_levels ( 1
				distance_level (
					distance_level_header (
						dlevel_selection ( 2000 )
						hierarchy ( 1 -1 )
					)
					sub_objects ( 1
						sub_object (
							sub_object_header ( 00000400 -1 -1 000001d2 000001c4
								geometry_info ( 2 1 0 6 0 0 1 0 0 0
									geometry_nodes ( 1
										geometry_node ( 1 0 0 0 0
											cullable_prims ( 1 2 6 )
										)
									)
									geometry_node_map ( 1 0 )
								)
								subobject_shaders ( 1 0 )
								subobject_light_cfgs ( 1 0 ) 0
							)
							vertices ( 4
								vertex ( 00000000 0 0 ff969696 ff808080
									vertex_uvs ( 1 0 )
								)
								vertex ( 00000000 1 0 ff969696 ff808080
									vertex_uvs ( 1 1 )
								)
								vertex ( 00000000 2 0 ff969696 ff808080
									vertex_uvs ( 1 2 )
								)
								vertex ( 00000000 3 0 ff969696 ff808080
									vertex_uvs ( 1 3 )
								)
							)
							vertex_sets ( 1
								vertex_set ( 0 0 4 )
							)
							primitives ( 2
								prim_state_idx ( 0 )
								indexed_trilist (
									vertex_idxs ( 6 0 2 1 3 1 2 )
									normal_idxs ( 2 1 3 1 3 )
									flags ( 2 00000000 00000000 )
								)
							)
						)
					)
				)
			)
		)
	)
)
